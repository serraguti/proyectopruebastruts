<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="includes/webhead.jsp"/>
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="includes/webmenu.jsp"/>
        <section>
            <main role="main" class="container">
                <div class="starter-template">
                    <h1>Departamentos</h1>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>Numero</th>
                                <th>Nombre</th>
                                <th>Localidad</th>
                            </tr>
                        </thead>
                        <tbody>
                            <logic:iterate name="LISTDEPARTAMENTOS" id="dept">
                                <tr>
                                    <td>
                                        <bean:write name="dept" property="numero"/>
                                    </td>
                                    <td>
                                        <bean:write name="dept" property="nombre"/>
                                    </td>
                                    <td><bean:write name="dept" property="localidad"/></td>
                                </tr>
                            </logic:iterate>
                        </tbody>
                    </table>
                </div>
            </main><!-- /.container -->            
        </section>
        <jsp:include page="includes/webfooter.jsp"/>
    </body>
</html>
