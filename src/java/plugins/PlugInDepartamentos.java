package plugins;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import models.Departamento;
import org.apache.struts.action.ActionServlet;
import org.apache.struts.action.PlugIn;
import org.apache.struts.config.ModuleConfig;
import repositories.RepositoryDepartamentos;

public class PlugInDepartamentos implements PlugIn {

    RepositoryDepartamentos repo;
    
    public PlugInDepartamentos(){
        this.repo = new RepositoryDepartamentos();
    }
    
    @Override
    public void destroy() {}

    @Override
    public void init(ActionServlet servlet, ModuleConfig config) throws ServletException {
        try{
            ArrayList<Departamento> departamentos = this.repo.getDepartamentos();
            servlet.getServletContext().setAttribute("LISTDEPARTAMENTOS", departamentos);
        }catch (SQLException ex){
            throw new ServletException("Error SQL " + ex);
        }
    }
}
