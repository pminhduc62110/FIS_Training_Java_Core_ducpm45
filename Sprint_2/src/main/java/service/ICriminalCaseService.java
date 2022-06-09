package service;

import core.CriminalCase;

import java.util.List;

public interface ICriminalCaseService {
    /**
     * Tao moi 1 criminal case va tra ve no sau khi add thanh cong vao he thong
     * @param criminalCase
     * @return criminal case sau khi da tao moi va add thanh cong vao he thong
     */
    CriminalCase createCriminalCase(CriminalCase criminalCase);

    /**
     * lay ra danh sach tat ca ho so vu an dang luu trong he thong
     * @return danh sach tat ca cac vu an
     */
    List<CriminalCase> loadAll();

}
