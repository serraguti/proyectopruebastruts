<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<header>
    <nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
        <a class="navbar-brand" href="#">Proyecto Struts</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarsExampleDefault">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <html:link href="webdepartamentos.jsp" styleClass="nav-link">
                        Departamentos
                        <span class="sr-only">(current)</span>
                    </html:link>
                </li>
                <li class="nav-item">
                    <html:link href="webeliminardepartamento.jsp" 
                               styleClass="nav-link btn btn-outline-danger">
                        Eliminar departamento
                    </html:link>
                </li>         
            </ul>
        </div>
    </nav>            
</header>
