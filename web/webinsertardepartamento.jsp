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
                    <h1>Nuevo departamento</h1>
                    <html:form action="/ActionInsertarDepartamento">
                        <label>Número: </label>
                        <html:text property="numero" styleClass="form-control"/><br/>
                        <label>Nombre: </label>
                        <html:text property="nombre" styleClass="form-control"/><br/>
                        <label>Localidad: </label>
                        <html:text property="localidad" styleClass="form-control"/><br/>
                        <button type="submit" class="btn btn-info">
                            Insertar departamento
                        </button>
                    </html:form>
                </div>
            </main><!-- /.container -->            
        </section>
        <jsp:include page="includes/webfooter.jsp"/>
    </body>
</html>
