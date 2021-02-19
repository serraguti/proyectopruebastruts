package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import models.Departamento;
import oracle.jdbc.OracleDriver;

public class RepositoryDepartamentos {
    private Connection getConnection() throws SQLException{
        DriverManager.registerDriver(new OracleDriver());
        String cadena = "jdbc:oracle:thin:@LOCALHOST:1521:XE";
        Connection cn = DriverManager.getConnection(cadena,"system","oracle");
        return cn;
    }
    
    public ArrayList<Departamento> getDepartamentos() throws SQLException{
        Connection cn = this.getConnection();
        String sql = "select * from dept";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Departamento> lista = new ArrayList<>();
        while (rs.next()){
            int num = rs.getInt("DEPT_NO");
            String nom = rs.getString("DNOMBRE");
            String loc = rs.getString("LOC");
            Departamento dept = new Departamento(num, nom, loc);
            lista.add(dept);
        }
        rs.close();
        cn.close();
        return lista;
    }
    
    public void eliminarDepartamento(int deptno) throws SQLException{
        Connection cn = this.getConnection();
        String sql = "delete from dept where dept_no=?";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setInt(1, deptno);
        pst.executeUpdate();
        cn.close();
    }
}
