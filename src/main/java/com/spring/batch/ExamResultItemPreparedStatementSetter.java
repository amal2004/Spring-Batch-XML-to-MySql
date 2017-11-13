package com.spring.batch;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.batch.item.database.ItemPreparedStatementSetter;

import com.spring.batch.model.ExamResult;

public class ExamResultItemPreparedStatementSetter implements ItemPreparedStatementSetter<ExamResult>  {

	@Override
	public void setValues(ExamResult result, PreparedStatement ps)
			throws SQLException {
		ps.setString(1, result.getStudentName());
        ps.setDate(2, new java.sql.Date(result.getDob().toDate().getTime()));
        ps.setDouble(3, result.getPercentage());
		
	}

}
