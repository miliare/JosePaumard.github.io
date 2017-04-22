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

package org.paumard.katas.fizzbuzzwoof;

/**
 * Created by José
 */
public class FizzBuzzWoof {

    public static final String FIZZ = "Fizz";

    public String convert(int input) {
        if (isDivisibleBy3(input)) {
            return FIZZ;
        }
        if (input % 5 == 0) {
            return "Buzz";
        }
        return "" + input;
    }

    private boolean isDivisibleBy3(int input) {
        return input % 3 == 0;
    }
}
