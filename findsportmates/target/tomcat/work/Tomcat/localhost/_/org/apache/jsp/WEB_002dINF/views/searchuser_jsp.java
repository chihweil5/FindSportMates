/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-12-03 19:46:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class searchuser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/views/common/navigation.jspf", Long.valueOf(1480531884000L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jspf", Long.valueOf(1480639762000L));
    _jspx_dependants.put("/WEB-INF/views/common/header.jspf", Long.valueOf(1480712788000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fclass_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fclass_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fclass_005faction.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>FindSportMates</title>\n");
      out.write("<link href=\"webjars/bootstrap/3.3.6/css/bootstrap.min.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("<!-- Special version of Bootstrap that only affects content wrapped in .bootstrap-iso -->\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://formden.com/static/cdn/bootstrap-iso.css\" />\n");
      out.write("\n");
      out.write("<!--Font Awesome (added because you use icons in your prepend/append)-->\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://formden.com/static/cdn/font-awesome/4.4.0/css/font-awesome.min.css\" />\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Extra JavaScript/CSS added manually in \"Settings\" tab -->\n");
      out.write("<!-- Include jQuery -->\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("\tsrc=\"https://code.jquery.com/jquery-1.11.3.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Include Date Range Picker -->\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css\" />\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Inline CSS based on choices in \"Settings\" tab -->\n");
      out.write("<style>\n");
      out.write(".bootstrap-iso .formden_header h2, .bootstrap-iso .formden_header p,\n");
      out.write("\t.bootstrap-iso form {\n");
      out.write("\tfont-family: Arial, Helvetica, sans-serif;\n");
      out.write("\tcolor: black\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bootstrap-iso form button, .bootstrap-iso form button:hover {\n");
      out.write("\tcolor: white !important;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".asteriskField {\n");
      out.write("\tcolor: red;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>");
      out.write('\n');
      out.write("<nav role=\"navigation\" class=\"navbar navbar-default\">\n");
      out.write("\t<div class=\"container-fluid\">\n");
      out.write("\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t<a class=\"navbar-brand\">FindSportMates</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"navbar-collapse\">\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t<li><a href=\"/event\">Current Events</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"/search-event\">Search Events</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"/manage-event\">My Events</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"/search-user\">Search User</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("\t<h1>Search User</h1>\n");
      out.write("\t");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_form_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fclass_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(null);
    // /WEB-INF/views/searchuser.jsp(6,1) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setAction("/search-user");
    // /WEB-INF/views/searchuser.jsp(6,1) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setMethod("post");
    // /WEB-INF/views/searchuser.jsp(6,1) null
    _jspx_th_form_005fform_005f0.setDynamicAttribute(null, "class", "form-horizontal");
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t<fieldset class=\"form-group\">\n");
          out.write("\t\t\t<div class=\"col-xs-3\">\n");
          out.write("\t\t\t\t<label>User Name:</label> \n");
          out.write("\t\t\t\t<input class=\"form-control\" type=\"text\" name=\"username\" placeholder=\"Enter username\">\n");
          out.write("\t\t\t</div>\n");
          out.write("\t\t</fieldset>\n");
          out.write("\t\t<div>\n");
          out.write("\t\t\t<button type=\"submit\" class=\"btn btn-primary btn-md\" >Search</button>\n");
          out.write("\t\t</div>\n");
          out.write("\t\t\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fclass_005faction.reuse(_jspx_th_form_005fform_005f0);
    }
    return false;
  }
}
