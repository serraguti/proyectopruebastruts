package controllers;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Departamento;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import repositories.RepositoryDepartamentos;

public class ActionInsertarDepartamento extends org.apache.struts.action.Action {

    RepositoryDepartamentos repo;
    
    public ActionInsertarDepartamento(){
        this.repo = new RepositoryDepartamentos();
    }
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        DynaActionForm f = (DynaActionForm)form;
        String dato = f.get("numero").toString();
        int num = Integer.parseInt(dato);
        String nom = f.get("nombre").toString();
        String loc = f.get("localidad").toString();
        this.repo.insertarDepartamento(num, nom, loc);
        ArrayList<Departamento> departamentos = this.repo.getDepartamentos();
        request.getServletContext().setAttribute("LISTDEPARTAMENTOS", departamentos);
        return mapping.findForward("webinsertardepartamento");
    }
}
