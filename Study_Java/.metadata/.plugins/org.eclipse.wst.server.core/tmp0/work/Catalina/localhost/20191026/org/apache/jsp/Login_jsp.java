/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.20
 * Generated at: 2020-04-30 02:44:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"renderer\" content=\"webkit|ie-comp|ie-stand\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no\" />\r\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-siteapp\" />\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/html5shiv.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/respond.min.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<link href=\"static/h-ui/css/H-ui.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"static/h-ui.admin/css/H-ui.login.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"static/h-ui.admin/css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"lib/Hui-iconfont/1.0.8/iconfont.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<!--[if IE 6]>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/DD_belatedPNG_0.0.8a-min.js\" ></script>\r\n");
      out.write("<script>DD_belatedPNG.fix('*');</script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<title>系统登陆页面</title>\r\n");
      out.write("<meta name=\"keywords\" content=\"H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载\">\r\n");
      out.write("<meta name=\"description\" content=\"H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<input type=\"hidden\" id=\"TenantId\" name=\"TenantId\" value=\"\" />\r\n");
      out.write("\r\n");
      out.write("<div class=\"loginWraper\">\r\n");
      out.write("  <div id=\"loginform\" class=\"loginBox\">\r\n");
      out.write("    <form class=\"form form-horizontal\" action=\"LoginServlet\" method=\"post\">\r\n");
      out.write("      <div class=\"row cl\">\r\n");
      out.write("        <label class=\"form-label col-xs-3\"><i class=\"Hui-iconfont\">&#xe60d;</i></label>\r\n");
      out.write("        <div class=\"formControls col-xs-8\">\r\n");
      out.write("          <input id=\"\" name=\"username\" type=\"text\" placeholder=\"用户名\" class=\"input-text size-L\">\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"row cl\">\r\n");
      out.write("        <label class=\"form-label col-xs-3\"><i class=\"Hui-iconfont\">&#xe60e;</i></label>\r\n");
      out.write("        <div class=\"formControls col-xs-8\">\r\n");
      out.write("          <input id=\"\" name=\"password\" type=\"password\" placeholder=\"密码\" class=\"input-text size-L\">\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("<!--       <div class=\"row cl\">\r\n");
      out.write("        <div class=\"formControls col-xs-8 col-xs-offset-3\">\r\n");
      out.write("          <input class=\"input-text size-L\" type=\"text\" placeholder=\"验证码\" onblur=\"if(this.value==''){this.value='验证码:'}\" onclick=\"if(this.value=='验证码:'){this.value='';}\" value=\"验证码:\" style=\"width:150px;\">\r\n");
      out.write("          <img src=\"\"> <a id=\"kanbuq\" href=\"javascript:;\">看不清，换一张</a> </div>\r\n");
      out.write("      </div> -->\r\n");
      out.write("    \r\n");
      out.write("      <div class=\"row cl\">\r\n");
      out.write("        <div class=\"formControls col-xs-8 col-xs-offset-3\">\r\n");
      out.write("          <input name=\"\" type=\"submit\" class=\"btn btn-success radius size-L\" style=\"margin-left:70px\" value=\"&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;\">\r\n");
      out.write("           <a href=\"reginst.jsp\" class=\"btn btn-success radius size-L\" >点击注册</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\t\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/jquery/1.9.1/jquery.min.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"static/h-ui/js/H-ui.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
