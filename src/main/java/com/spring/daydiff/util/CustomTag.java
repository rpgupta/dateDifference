package com.spring.daydiff.util;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;

public class CustomTag extends SimpleTagSupport {
   public void doTag() throws JspException, IOException {
      JspWriter out = getJspContext().getOut();
      out.println("This page has the data from H2 DB and shows the history of date difference transactions.");
   }
}