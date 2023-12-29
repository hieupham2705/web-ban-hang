package doan.dao;

import java.util.List;
import doan.entities.BienThe;

public interface BienTheDAO {
	public List<BienThe> getBienThe();
	public boolean insertBienThe(BienThe b);
	public BienThe getBienTheById(Integer id_bien_the);
	public boolean updateBienThe(BienThe b);
}
