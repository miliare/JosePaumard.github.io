package org.paumard.katas.phonenumbers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PhoneNumbers {
    public boolean isConsistent(List<String> phoneNumbersList) {

        Set<String> phoneNumberSet = new HashSet<>();
        for (String phoneNumber : phoneNumbersList) {
            for (int index = 1; index <= phoneNumber.length(); index++) {
                String phoneNumberPrefix = phoneNumber.substring(0, index);
                if (phoneNumberSet.contains(phoneNumberPrefix)) {
                    return false;
                }
            }
            phoneNumberSet.add(phoneNumber);
        }
        return true;
    }
}
