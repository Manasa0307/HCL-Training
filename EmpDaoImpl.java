package com.src.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;

import com.src.model.DbCredentials;
import com.src.model.Emp;
import com.src.util.DBUtil;

public class EmpDaoImpl implements EmpDao {

	@Override
	public boolean insert(Emp e) {
		Connection con = null;
		PreparedStatement pst = null;
		boolean b = false;
		DbCredentials credentials = DBUtil.getCredentials();
		try {
			con = DBUtil.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUname(),
					credentials.getPwd());
			if (con != null) {
				pst = con.prepareStatement("insert into emp values(?,?,?,?,?,?,?)");
				pst.setInt(1, e.getEno());
				pst.setString(2, e.getName());
				pst.setString(3, e.getAddress());
				pst.setInt(4, e.getSal());
				pst.setInt(5, e.getExp());
				pst.setString(6, e.getDesignation());
				pst.setDate(7, (Date) e.getDoj());
				int i = pst.executeUpdate();
				if (i > 0)
					b = true;
				con.close();
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return b;
	}

	@Override
	public boolean delete(int eno) {

		return false;
	}

	@Override
	public List<Emp> getAll() {

		return null;
	}

	@Override
	public Optional<Emp> get(int eno) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		Optional<Emp> empOptional = null;
		Emp e = null;
		DbCredentials credentials = DBUtil.getCredentials();
		try {
			con = DBUtil.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUname(),
					credentials.getPwd());
			if (con != null) {
				pst = con.prepareStatement("select * from student");
				pst.setInt(1, eno);
				rs = pst.executeQuery();
				rs.next();
				e = new Emp(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6),
						rs.getDate(7));
				empOptional = Optional.ofNullable(e);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return empOptional;
	}

	@Override
	public boolean update(int eno, Emp e) {

		return false;
	}
}