/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import java.util.List;

/**
 *
 * @author Admin
 */
public class RegularMember extends Member {

    public RegularMember(String name, int nemberId) {
        super(name, nemberId);
    }
 
    @Override
    
    public int maxbooks(){
        return 3;
    }
}
