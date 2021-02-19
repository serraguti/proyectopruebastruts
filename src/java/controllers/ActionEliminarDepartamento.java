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

public class ActionEliminarDepartamento extends org.apache.struts.action.Action {

    RepositoryDepartamentos repo;
    
    public ActionEliminarDepartamento(){
        this.repo = new  RepositoryDepartamentos();
    }
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        DynaActionForm f = (DynaActionForm)form;
        String dato = f.get("deptno").toString();
        int deptno = Integer.parseInt(dato);
        this.repo.eliminarDepartamento(deptno);
        ArrayList<Departamento> departamentos = this.repo.getDepartamentos();
        request.setAttribute("LISTDEPARTAMENTOS", departamentos);
        return mapping.findForward("webdepartamentos");
    }
}
