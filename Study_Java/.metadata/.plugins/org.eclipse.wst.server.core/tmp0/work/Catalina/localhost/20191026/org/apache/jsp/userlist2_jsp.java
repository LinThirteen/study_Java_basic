/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.20
 * Generated at: 2020-04-30 02:58:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Dao.UserDao;
import java.util.*;
import en.T_user;

public final class userlist2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("Dao.UserDao");
    _jspx_imports_classes.add("en.T_user");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(" \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

List<T_user> listuser = (List<T_user>)request.getAttribute("listuser");


      out.write("  \r\n");
      out.write("     \r\n");
      out.write("    \r\n");
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"static/h-ui/css/H-ui.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"static/h-ui.admin/css/H-ui.admin.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"lib/Hui-iconfont/1.0.8/iconfont.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"static/h-ui.admin/skin/default/skin.css\" id=\"skin\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"static/h-ui.admin/css/style.css\" />\r\n");
      out.write("<!--[if IE 6]>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/DD_belatedPNG_0.0.8a-min.js\" ></script>\r\n");
      out.write("<script>DD_belatedPNG.fix('*');</script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<title>资讯列表</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("<nav class=\"breadcrumb\"><i class=\"Hui-iconfont\">&#xe67f;</i> 首页 <span class=\"c-gray en\">&gt;</span> 用户管理 <span class=\"c-gray en\">&gt;</span><a class=\"btn btn-success radius r\" style=\"line-height:1.6em;margin-top:3px\" href=\"javascript:location.replace(location.href);\" title=\"刷新\" ><i class=\"Hui-iconfont\">&#xe68f;</i></a></nav>\r\n");
      out.write("<div class=\"page-container\">\r\n");
      out.write("\t\r\n");
      out.write("\t<form action=\"UserlistServlets\" method=\"post\">\r\n");
      out.write("\t<iframe scrolling=\"no\" src=\"https://tianqiapi.com/api.php?style=tq&skin=pitaya\" frameborder=\"0\" width=\"100%\" height=\"25\" allowtransparency=\"true\"></iframe>\r\n");
      out.write("\t<input type=\"text\" name=\"values\" id=\"\" placeholder=\" 编号/用户名/密码/电话/性别/地址\" style=\"width:400px;margin-left:350px;margin-top:20px\" class=\"input-text\">\r\n");
      out.write("\t\t<button name=\"\" id=\"\" class=\"btn btn-success\" type=\"submit\" style=\"\"><i class=\"Hui-iconfont\">&#xe665;</i> 准确查询</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\r\n");
      out.write("\t<form action=\"UserlistServlet\" method=\"post\">\r\n");
      out.write("\t\t<input type=\"text\" name=\"values\" id=\"\" placeholder=\" 编号/用户名/密码/电话/性别/地址\" style=\"width:400px;margin-left:370px\" class=\"input-text\">\r\n");
      out.write("\t\t<button name=\"\" id=\"\" class=\"btn btn-success\" type=\"submit\"><i class=\"Hui-iconfont\">&#xe665;</i> 模糊查询</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"cl pd-5 bg-1 bk-gray mt-20\"> <span class=\"l\"><a href=\"javascript:;\" onclick=\"datadel()\" class=\"btn btn-danger radius\">\r\n");
      out.write("\t<i class=\"Hui-iconfont\">&#xe6e2;</i> 批量删除</a> \r\n");
      out.write("\t<a class=\"btn btn-primary radius\" data-title=\"增加用户\" data-href=\"user_add.jsp\" onclick=\"Hui_admin_tab(this)\" href=\"javascript:;\">\r\n");
      out.write("\t<i class=\"Hui-iconfont\">&#xe600;</i>增加用户</a></span> <span class=\"r\">共有数据：<strong>54</strong> 条</span> </div>\r\n");
      out.write("\t<div class=\"mt-20\">\r\n");
      out.write("\t\t<table class=\"table table-border table-bordered table-bg table-hover table-sort table-responsive\">\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr class=\"text-c\">\r\n");
      out.write("\t\t\t\t\t<th width=\"25\">\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" name=\"\" value=\"\"></th>\r\n");
      out.write("\t\t\t\t\t<th width=\"80\">ID</th>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<th width=\"80\">用户名</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"80\">密码</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"40\">性别</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"80\">电话</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"80\">地址</th>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t<th width=\"60\">发布状态</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"120\">操作</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t\t<tbody>\r\n");
      out.write("\t\t\t");

			for(int i=0;i<listuser.size();i++){
				
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr class=\"text-c\">\r\n");
      out.write("\t\t\t\t\t<td><input type=\"checkbox\" value=\"\" name=\"\"></td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(listuser.get(i).getId() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(listuser.get(i).getUser() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(listuser.get(i).getPassword() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(listuser.get(i).getSex() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(listuser.get(i).getPhone() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(listuser.get(i).getAddress() );
      out.write("</td>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<td class=\"td-status\"><span class=\"label label-success radius\">已发布</span></td>\r\n");
      out.write("\t\t\t\t\t<td class=\"f-14 td-manage\"><a style=\"text-decoration:none\" onClick=\"article_stop(this,'10001')\" href=\"javascript:;\" title=\"下架\">\r\n");
      out.write("\t\t\t\t\t<i class=\"Hui-iconfont\">&#xe6de;</i></a> \r\n");
      out.write("\t\t\t\t\t<a style=\"text-decoration:none\" class=\"ml-5\" onClick=\"article_edit('资讯编辑','article-add.html','10001')\" href=\"updateUser.jsp?id=");
      out.print(listuser.get(i).getId() );
      out.write("&username=");
      out.print(listuser.get(i).getUser() );
      out.write("&password=");
      out.print(listuser.get(i).getPassword() );
      out.write("&sex=");
      out.print(listuser.get(i).getSex() );
      out.write("&address=");
      out.print(listuser.get(i).getAddress() );
      out.write("&phone=");
      out.print(listuser.get(i).getPhone() );
      out.write("\" title=\"编辑\"><i class=\"Hui-iconfont\">&#xe6df;</i></a>\r\n");
      out.write("\t\t\t\t\t <a style=\"text-decoration:none\" class=\"ml-5\" onClick=\"article_del(this,'10001')\" href=\"DeleteServlet?id=");
      out.print(listuser.get(i).getId() );
      out.write("\" title=\"删除\"><i class=\"Hui-iconfont\">&#xe6e2;</i></a></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
	
			}
			
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--_footer 作为公共模版分离出去-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/jquery/1.9.1/jquery.min.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/layer/2.4/layer.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"static/h-ui/js/H-ui.min.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"static/h-ui.admin/js/H-ui.admin.js\"></script> <!--/_footer 作为公共模版分离出去-->\r\n");
      out.write("\r\n");
      out.write("<!--请在下方写此页面业务相关的脚本-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/My97DatePicker/4.8/WdatePicker.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/datatables/1.10.0/jquery.dataTables.min.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/laypage/1.2/laypage.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$('.table-sort').dataTable({\r\n");
      out.write("\t\"aaSorting\": [[ 1, \"desc\" ]],//默认第几个排序\r\n");
      out.write("\t\"bStateSave\": true,//状态保存\r\n");
      out.write("\t\"pading\":false,\r\n");
      out.write("\t\"aoColumnDefs\": [\r\n");
      out.write("\t  //{\"bVisible\": false, \"aTargets\": [ 3 ]} //控制列的隐藏显示\r\n");
      out.write("\t  {\"orderable\":false,\"aTargets\":[0,8]}// 不参与排序的列\r\n");
      out.write("\t]\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("/*资讯-添加*/\r\n");
      out.write("function article_add(title,url,w,h){\r\n");
      out.write("\tvar index = layer.open({\r\n");
      out.write("\t\ttype: 2,\r\n");
      out.write("\t\ttitle: title,\r\n");
      out.write("\t\tcontent: url\r\n");
      out.write("\t});\r\n");
      out.write("\tlayer.full(index);\r\n");
      out.write("}\r\n");
      out.write("/*资讯-编辑*/\r\n");
      out.write("function article_edit(title,url,id,w,h){\r\n");
      out.write("\tvar index = layer.open({\r\n");
      out.write("\t\ttype: 2,\r\n");
      out.write("\t\ttitle: title,\r\n");
      out.write("\t\tcontent: url\r\n");
      out.write("\t});\r\n");
      out.write("\tlayer.full(index);\r\n");
      out.write("}\r\n");
      out.write("/*资讯-删除*/\r\n");
      out.write("function article_del(obj,id){\r\n");
      out.write("\tlayer.confirm('确认要删除吗？',function(index){\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype: 'POST',\r\n");
      out.write("\t\t\turl: '',\r\n");
      out.write("\t\t\tdataType: 'json',\r\n");
      out.write("\t\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t\t$(obj).parents(\"tr\").remove();\r\n");
      out.write("\t\t\t\tlayer.msg('已删除!',{icon:1,time:1000});\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror:function(data) {\r\n");
      out.write("\t\t\t\tconsole.log(data.msg);\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t});\t\t\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*资讯-审核*/\r\n");
      out.write("function article_shenhe(obj,id){\r\n");
      out.write("\tlayer.confirm('审核文章？', {\r\n");
      out.write("\t\tbtn: ['通过','不通过','取消'], \r\n");
      out.write("\t\tshade: false,\r\n");
      out.write("\t\tcloseBtn: 0\r\n");
      out.write("\t},\r\n");
      out.write("\tfunction(){\r\n");
      out.write("\t\t$(obj).parents(\"tr\").find(\".td-manage\").prepend('<a class=\"c-primary\" onClick=\"article_start(this,id)\" href=\"javascript:;\" title=\"申请上线\">申请上线</a>');\r\n");
      out.write("\t\t$(obj).parents(\"tr\").find(\".td-status\").html('<span class=\"label label-success radius\">已发布</span>');\r\n");
      out.write("\t\t$(obj).remove();\r\n");
      out.write("\t\tlayer.msg('已发布', {icon:6,time:1000});\r\n");
      out.write("\t},\r\n");
      out.write("\tfunction(){\r\n");
      out.write("\t\t$(obj).parents(\"tr\").find(\".td-manage\").prepend('<a class=\"c-primary\" onClick=\"article_shenqing(this,id)\" href=\"javascript:;\" title=\"申请上线\">申请上线</a>');\r\n");
      out.write("\t\t$(obj).parents(\"tr\").find(\".td-status\").html('<span class=\"label label-danger radius\">未通过</span>');\r\n");
      out.write("\t\t$(obj).remove();\r\n");
      out.write("    \tlayer.msg('未通过', {icon:5,time:1000});\r\n");
      out.write("\t});\t\r\n");
      out.write("}\r\n");
      out.write("/*资讯-下架*/\r\n");
      out.write("function article_stop(obj,id){\r\n");
      out.write("\tlayer.confirm('确认要下架吗？',function(index){\r\n");
      out.write("\t\t$(obj).parents(\"tr\").find(\".td-manage\").prepend('<a style=\"text-decoration:none\" onClick=\"article_start(this,id)\" href=\"javascript:;\" title=\"发布\"><i class=\"Hui-iconfont\">&#xe603;</i></a>');\r\n");
      out.write("\t\t$(obj).parents(\"tr\").find(\".td-status\").html('<span class=\"label label-defaunt radius\">已下架</span>');\r\n");
      out.write("\t\t$(obj).remove();\r\n");
      out.write("\t\tlayer.msg('已下架!',{icon: 5,time:1000});\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*资讯-发布*/\r\n");
      out.write("function article_start(obj,id){\r\n");
      out.write("\tlayer.confirm('确认要发布吗？',function(index){\r\n");
      out.write("\t\t$(obj).parents(\"tr\").find(\".td-manage\").prepend('<a style=\"text-decoration:none\" onClick=\"article_stop(this,id)\" href=\"javascript:;\" title=\"下架\"><i class=\"Hui-iconfont\">&#xe6de;</i></a>');\r\n");
      out.write("\t\t$(obj).parents(\"tr\").find(\".td-status\").html('<span class=\"label label-success radius\">已发布</span>');\r\n");
      out.write("\t\t$(obj).remove();\r\n");
      out.write("\t\tlayer.msg('已发布!',{icon: 6,time:1000});\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("/*资讯-申请上线*/\r\n");
      out.write("function article_shenqing(obj,id){\r\n");
      out.write("\t$(obj).parents(\"tr\").find(\".td-status\").html('<span class=\"label label-default radius\">待审核</span>');\r\n");
      out.write("\t$(obj).parents(\"tr\").find(\".td-manage\").html(\"\");\r\n");
      out.write("\tlayer.msg('已提交申请，耐心等待审核!', {icon: 1,time:2000});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script> \r\n");
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
