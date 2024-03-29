package project.hm.p0003.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public interface P0003Controller {
	public ModelAndView searchList(String cust_id, HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView searchMod(String cust_id, HttpServletRequest request, HttpServletResponse response) throws Exception;
	public ModelAndView searchInit(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	
	public ResponseEntity updateMember(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
}
