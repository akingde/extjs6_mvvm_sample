package com.market.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.market.dao.APIDao;
import com.market.domain.Member;
import com.market.domain.Order;
import com.market.domain.Product;

@Service
public class APIService {
	
	@Autowired
	private APIDao dao;

	/**
	 * 상품등록
	 * @param param
	 * @throws SQLException
	 */
	public void addProduct(Product param)  throws SQLException{
		dao.addProduct(param);
	}
	
	/**
	 * 상품수정
	 * @param param
	 * @throws SQLException
	 */
	public void updateProduct(Product param)  throws SQLException {
		dao.updateProduct(param);
	}
	
	/**
	 * 상품삭제
	 * @param param
	 */
	public void removeProduct(Product param) throws SQLException {
		dao.removeProduct(param);
	}

	/**
	 * 상품 목록 수 조회
	 * @param param
	 * @return
	 * @throws SQLException
	 */
	public Long listProductTotalCount(Product param)  throws SQLException {
		return dao.listProductTotalCount(param);
	}

	/**
	 * 상품 목록 조회
	 * @param param
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String,Object>> listProduct(Product param)  throws SQLException {
		return dao.listProduct(param);
	}

	/**
	 * 멤버 수 조회
	 * @param param
	 * @return
	 * @throws SQLException
	 */
	public Long listMemberTotalCount(Member param)  throws SQLException {
		return dao.listMemberTotalCount(param);
	}

	/**
	 * 멤버목록 조회
	 * @param param
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> listMember(Member param)  throws SQLException {
		return dao.listMember(param);
	}
	
	/**
	 * 주문 수 조회
	 * @param param
	 * @return
	 * @throws SQLException
	 */
	public Long listOrderTotalCount(Order param)  throws SQLException {
		return dao.listOrderTotalCount(param);
	}

	/**
	 * 주문목록 조회
	 * @param param
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> listOrder(Order param)  throws SQLException {
		return dao.listOrder(param);
	}

	/**
	 * 비밀번호 변경
	 * @param param
	 */
	public void updatePassword(Map<String, Object> param)  throws SQLException {
		dao.updatePassword(param);
	}
}
