package com.test.practise;

import java.util.Arrays;

public class IngramMicroWorks {

  public static void main(String[] args) {
    String authorizations = "CPIA[Until12-NOV-68],CSPP[Until29-NOV-22],CTMP[Until12-NOV-68],Duo-CP[Until20-AUG-21],ETF[Until27-JUL-19],Meraki-CP[Until31-DEC-99],NFR-std[Until12-NOV-68],OIPTIP[Until12-NOV-68],P2P[Until20-SEP-22],PFP01P[Until],PP_US_PRP3[Until28-JUL-18],PP_US_SVP3[Until28-JUL-18],REGISTERED[Until29-NOV-22],RWD-US[Until31-JUL-20],SRP[Until12-NOV-68],TAB[Until05-JAN-20],USFed_Auth[Until06-APR-22],VIP33-NBAB[Until30-JAN-21],VIP39-DCA[Until30-JUL-22],VIP39-ENA[Until30-JUL-22],VIP39-IOT[Until30-JUL-22],VIP39-MERA[Until30-JUL-22],VIP39-SECA[Until30-JUL-22]";
    String[] authArray = authorizations.split(",");
    for(String s : authArray){
      String[] subArray = s.split("\\[Until");
      String authId = subArray[0];
      String authDate = subArray[1].substring(0,subArray[1].length()-1);
      System.out.println(authDate);
    }

    //System.out.println(Arrays.toString(authArray));
  }
}
