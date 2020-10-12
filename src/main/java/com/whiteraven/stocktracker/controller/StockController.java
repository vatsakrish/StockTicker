/**
 * 
 */
package com.whiteraven.stocktracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author vatsa
 *
 */

@Controller
public class StockController {


	@GetMapping("/login")
	  public String login() {
	    return "welcome";
	  }

}


