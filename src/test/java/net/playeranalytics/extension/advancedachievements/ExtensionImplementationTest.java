/*
    Copyright(c) 2019 Risto Lahtela (Rsl1122)

    The MIT License(MIT)

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files(the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and / or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions :
    The above copyright notice and this permission notice shall be included in
    all copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
    THE SOFTWARE.
*/
package net.playeranalytics.extension.advancedachievements;

import com.djrapitops.plan.extension.DataExtension;
import com.djrapitops.plan.extension.extractor.ExtensionExtractor;
import com.hm.achievement.api.AdvancedAchievementsAPI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

/**
 * Test for the implementation of the new extension
 *
 * @author Rsl1122
 */
class ExtensionImplementationTest {

    private ExtensionExtractor extractor;

    @BeforeEach
    void prepareExtractor() {
        AdvancedAchievementsAPI apiMock = mock(AdvancedAchievementsAPI.class);

        DataExtension extension = new AdvancedAchievementsExtension(apiMock);
        extractor = new ExtensionExtractor(extension);
    }

    @Test
    @DisplayName("API is implemented correctly")
    void noImplementationErrors() {
        extractor.validateAnnotations();
    }

}