/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.45
 * Generated at: 2019-12-18 10:47:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views._6_005flee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productCategoryForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/dstay_workspace1/dstayproject/src/main/webapp/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1576665400215L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<!-- <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("    <meta name=\"description\" content=\"Kimi is a curated foods and beverages artisans.\">\r\n");
      out.write("    <meta name=\"author\" content=\"Philip Herlambang\">\r\n");
      out.write("    <meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\r\n");
      out.write("    <meta name=\"mobile-web-app-capable\" content=\"yes\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <meta name=\"twitter:card\" content=\"summary\">\r\n");
      out.write("    <meta name=\"title\" content=\"Back to Kimi\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no\">\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"Content-Language\" content=\"en-id\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    open graph metadata facebook, slack, whatsapp line\r\n");
      out.write("    <meta property=\"fb:app_id\" content=\"150112802189143\"/>\r\n");
      out.write("    <meta property=\"og:locale\" content=\"en_US\" />\r\n");
      out.write("    <meta property=\"og:title\" content=\"Back to Kimi\" />\r\n");
      out.write("    <meta property='og:site_name' content='Kimi | Curated Foods and Beverages' />\r\n");
      out.write("    <meta property=\"og:url\" content=\"http://kimistatic.s3-website-ap-southeast-1.amazonaws.com/\" />\r\n");
      out.write("    <meta property=\"og:description\" content=\"Kimi is a curated foods and beverages artisans.\" />\r\n");
      out.write("    <meta property='og:image' content=\"https://s3-ap-southeast-1.amazonaws.com/kimistatic/images/apple-touch-icon.png\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    open graph metadata twitter\r\n");
      out.write("    <meta name=\"twitter:title\" content=\"Back to Kimi\">\r\n");
      out.write("    <meta name=\"twitter:url\" content=\"http://www.backtokimi.com\">\r\n");
      out.write("    <meta name=\"twitter:description\" content=\"Kimi is a curated foods and beverages artisans.\">\r\n");
      out.write("    <meta name=\"twitter:image\" content=\"https://s3-ap-southeast-1.amazonaws.com/kimistatic/images/apple-touch-icon.png\">\r\n");
      out.write("    <meta name=\"twitter:site\" content=\"@backtokimi\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"icon\" href=\"https://s3-ap-southeast-1.amazonaws.com/kimistatic/images/favicon.ico\">\r\n");
      out.write("    <link rel=\"apple-touch-icon\" href=\"https://s3-ap-southeast-1.amazonaws.com/kimistatic/images/apple-touch-icon.png\">\r\n");
      out.write("\r\n");
      out.write("    <title>Articles</title>\r\n");
      out.write("\r\n");
      out.write("    Bootstrap core CSS\r\n");
      out.write("    <link href=\"resources/css/6_lee/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"resources/css/6_lee/kimi.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"resources/css/6_lee/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    owl carousel\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/css/6_lee/owl_carousel/owl.carousel.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/css/6_lee/owl_carousel/owl.theme.default.css\">\r\n");
      out.write(" -->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container-fluid less-padding\">\r\n");
      out.write("   \t \t<h2 class=\"default-userProductList-InfoBar-title text-center\"><i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> Editor's Pick</h2>\r\n");
      out.write("   \t \t<div class=\"small-slider owl-carousel owl-theme\">\r\n");
      out.write("\t\t \t\t\r\n");
      out.write("\t     \t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<br><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- <script src=\"resources/js/6_lee/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("owl carousel\r\n");
      out.write("<script src=\"resources/js/6_lee/owl_carousel/owl.carousel.js\"></script>\r\n");
      out.write("\r\n");
      out.write("boostrap js\r\n");
      out.write("<script>window.jQuery || document.write('<script src=\"../../assets/js/vendor/jquery.min.js\"><\\/script>')</script>\r\n");
      out.write("<script src=\"resources/js/6_lee/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("tipuesearch\r\n");
      out.write("<script src=\"resources/js/6_lee/tipusearch/tipuesearch_content.js\"></script>\r\n");
      out.write("<script src=\"resources/js/6_lee/tipusearch/tipuesearch_set.js\"></script>\r\n");
      out.write("<script src=\"resources/js/6_lee/tipusearch/tipuesearch.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"resources/js/6_lee/prism/prism.js\"></script>\r\n");
      out.write("\r\n");
      out.write("kimi basic js\r\n");
      out.write("<script src=\"resources/js/6_lee/kimi.js\"></script> -->\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/6_lee/productCategoryForm.jsp(62,7) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/6_lee/productCategoryForm.jsp(62,7) '${pc}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pc}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/6_lee/productCategoryForm.jsp(62,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("pc");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t   \r\n");
            out.write("\t\t         <a href=\"productCotegory.do?pcno=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pc.no}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" class=\"item\">\r\n");
            out.write("\t\t            <div class=\"scrim\"></div>\r\n");
            out.write("\t\t            \t<span class=\"small-text-overlay\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pc.pcSum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(" Products</span>\r\n");
            out.write("\t\t            <p>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pc.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</p>\r\n");
            out.write("\t\t            <img src=\"resources/images/6_lee/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pc.origin_fileName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" width=\"100%\" style=\"height:160px;\">\r\n");
            out.write("\t\t        </a> \r\n");
            out.write("\t\t        \r\n");
            out.write("\t        ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
