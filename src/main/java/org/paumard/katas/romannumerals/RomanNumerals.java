/*
 * Copyright (C) 2017 José Paumard
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.paumard.katas.romannumerals;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by José
 */
public class RomanNumerals {

    public static final String I = "I";
    public static final String V = "V";
    public static final String X = "X";
    public static final String L = "L";
    public static final String C = "C";

    public String toRoman(int input) {

        if (input >= 10) {
            return convertTensDigit(input);
        } else {
            return convertUnitDigit(input);
        }
    }

    private String convertTensDigit(int input) {
        input = input / 10;
        return convertToDigit(input, X, L, C);
    }

    private String convertUnitDigit(int input) {
        return convertToDigit(input, I, V, X);
    }

    private String convertToDigit(int input, String symbolFor1, String symbolFor5, String symbolFor10) {
        switch (input) {
            case 1:
            case 2:
            case 3:
                return repeatSymbol(input, symbolFor1);
            case 4:
                return symbolFor1 + symbolFor5;
            case 5:
                return symbolFor5;
            case 6:
            case 7:
            case 8:
                return symbolFor5 + repeatSymbol(input - 5, symbolFor1);
            case 9:
                return symbolFor1 + symbolFor10;
        }
        return null;
    }

    private String repeatSymbol(int input, String symbol) {
        return IntStream.range(0, input).mapToObj(i -> symbol).collect(Collectors.joining());
    }
}
