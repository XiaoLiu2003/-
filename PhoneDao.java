package com.ntlg.test23.dao;

import java.util.List;

import com.ntlg.test23.model.Phone;

public interface PhoneDao {

	public Phone getPhoneByPhoneId(String phoneId);

	public int insertPhone(Phone phone);

	public List<Phone> getAllPhoneList();

	public List<Phone> getPhoneListByPhoneName(String phoneName);

	public int updatePhone(Phone phone);

	public int deletePhone(String phoneId);

}
