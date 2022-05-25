package mainJPA;

import java.io.IOException;
import java.sql.SQLException;


import javax.persistence.EntityManager;
import javax.persistence.Query;

import control.SalvarPessoa;
import jpaUtils.JPAUtil;

public class criarEntidades {
	
	public static void main(String[] args) throws IOException, SQLException {
		//criarDataBase();
		EntityManager classroomManager = JPAUtil.getEntityManager();
		classroomManager.getTransaction().begin();
		
		Query query  = classroomManager.createNativeQuery("SET @@cte_max_recursion_depth = 4294967295");
		Query query2  = classroomManager.createNativeQuery("INSERT INTO calendario (data) (\r\n"
				+ "WITH RECURSIVE CTE_CALENDARIO (DATA) AS (\r\n"
				+ "	SELECT\r\n"
				+ "	STR_TO_DATE('01/01/2020', '%d/%m/%Y')\r\n"
				+ "	UNION ALL\r\n"
				+ "	(\r\n"
				+ "		SELECT\r\n"
				+ "			DATE_ADD(DATA, INTERVAL 1 DAY) AS DATA\r\n"
				+ "		FROM\r\n"
				+ "			CTE_CALENDARIO\r\n"
				+ "		WHERE\r\n"
				+ "			DATA <= STR_TO_DATE('31/12/2030', '%d/%m/%Y')\r\n"
				+ "	)\r\n"
				+ ")\r\n"
				+ "(SELECT * FROM CTE_CALENDARIO)\r\n"
				+ ")");
		
		query.executeUpdate();
		query2.executeUpdate();
		classroomManager.getTransaction().commit();
		classroomManager.close();
		
		new SalvarPessoa();
	}

}
