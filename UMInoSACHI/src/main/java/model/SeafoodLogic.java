package model;

import java.util.ArrayList;

import dao.SeafoodDAO;

public class SeafoodLogic {
	public ArrayList<Seafood> showList() {
		SeafoodDAO dao = new SeafoodDAO();
		ArrayList<Seafood> seafoodList = dao.SelectAll();
		return seafoodList;
	}
	public Seafood showOne(String id) {
		SeafoodDAO dao = new SeafoodDAO();
		Seafood seafood = dao.SelectOneById(id);
		return seafood;
	}
}
