package com.offcn.controller;

import com.offcn.pojo.Grade;
import com.offcn.pojo.GradeExt;
import com.offcn.pojo.Teacher;
import com.offcn.service.GradeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

/**
 * @Author:hyz
 * @Description:
 * @Date: Create in 12:34 2020-04-17
 */

@Controller
@RequestMapping("/grade")
public class GradeController {


	@Resource
	GradeService gradeService;

	/**
	 * 删除单个学生成绩对象Action
	 *
	 * @param model
	 * @param id
	 * @param redirectAttributes
	 * @return
	 */
	@RequestMapping("/delete/{id}")
	public String deleteGrade(Model model, @PathVariable int id, RedirectAttributes redirectAttributes) {
		if (gradeService.delete(id) > 0) {
			redirectAttributes.addFlashAttribute("message", "删除成功！");
		} else {
			redirectAttributes.addFlashAttribute("message", "删除失败！");
		}
		return "redirect:/grade/getStuGrade";
	}

	/**
	 * 删除多个学生成绩对象Action
	 */
	@RequestMapping("/deletes")
	public String deletes(Model model, @RequestParam int[] id, RedirectAttributes redirectAttributes) {
		//执行删除
		System.out.println("批量删除" + id.toString());
		int rows = gradeService.deletes(id);
		if (rows > 0) {
			redirectAttributes.addFlashAttribute("message", "删除" + rows + "行记录成功！");
		} else {
			redirectAttributes.addFlashAttribute("message", "删除失败！");
		}
		return "redirect:/grade/getStuGrade";
	}

	/**
	 * 教师查看学生成绩
	 *
	 * @param model
	 * @param req
	 * @return
	 */
	@RequestMapping("/getStuGrade")
	public String getStuGrade(Model model, HttpServletRequest req) {
		HttpSession session = req.getSession();
		Teacher teacher = (Teacher) session.getAttribute("user");
		List<GradeExt> colist = gradeService.getGradeInfoTeacher(teacher.getId());
		model.addAttribute("colist", colist);
		return "grade/colist";
	}


	/**
	 * 编辑
	 */
	@RequestMapping("/edit/{id}")
	public String edit(Model model,@PathVariable int id){
		model.addAttribute("entity", gradeService.getGradeId(id));
		return "grade/edit";
	}

	/**
	 * 保存
	 */
	@RequestMapping("/editSave")
	public String editSave(Model model, @ModelAttribute("entity") @Valid Grade entity, BindingResult bindingResult){
		//如果模型中存在错误
		if(bindingResult.hasErrors()){
			model.addAttribute("entity", entity);
			return "/grade/edit";

		}else{
			gradeService.update(entity);
			return "redirect:getStuGrade";

		}

	}
}
