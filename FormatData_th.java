/*
 * Copyright (c) 2012, 2024, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * COPYRIGHT AND PERMISSION NOTICE
 *
 * Copyright (c) 1991-2022 Unicode, Inc. All rights reserved.
 * Distributed under the Terms of Use in https://www.unicode.org/copyright.html.
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of the Unicode data files and any associated documentation
 * (the "Data Files") or Unicode software and any associated documentation
 * (the "Software") to deal in the Data Files or Software
 * without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, and/or sell copies of
 * the Data Files or Software, and to permit persons to whom the Data Files
 * or Software are furnished to do so, provided that either
 * (a) this copyright and permission notice appear with all copies
 * of the Data Files or Software, or
 * (b) this copyright and permission notice appear in associated
 * Documentation.
 *
 * THE DATA FILES AND SOFTWARE ARE PROVIDED "AS IS", WITHOUT WARRANTY OF
 * ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT OF THIRD PARTY RIGHTS.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR HOLDERS INCLUDED IN THIS
 * NOTICE BE LIABLE FOR ANY CLAIM, OR ANY SPECIAL INDIRECT OR CONSEQUENTIAL
 * DAMAGES, OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE,
 * DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
 * TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
 * PERFORMANCE OF THE DATA FILES OR SOFTWARE.
 *
 * Except as contained in this notice, the name of a copyright holder
 * shall not be used in advertising or otherwise to promote the sale,
 * use or other dealings in these Data Files or Software without prior
 * written authorization of the copyright holder.
 */

package sun.text.resources.cldr.ext;

import java.util.ListResourceBundle;

public class FormatData_th extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String metaValue_generic_DateFormatItem_yyyyMMM = "MMM G y";
        final String metaValue_generic_DateFormatItem_yyyyMMMd = "d MMM G y";
        final String metaValue_generic_DateFormatItem_GyMMMEEEEd = "EEEE\u0e17\u0e35\u0e48 d MMM G y";
        final String metaValue_generic_DateFormatItem_yyyyMMMEd = "E d MMM G y";
        final String metaValue_generic_DateFormatItem_yyyyQQQQ = "QQQQ G y";
        final String[] metaValue_MonthNames = new String[] {
            "\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21",
            "\u0e01\u0e38\u0e21\u0e20\u0e32\u0e1e\u0e31\u0e19\u0e18\u0e4c",
            "\u0e21\u0e35\u0e19\u0e32\u0e04\u0e21",
            "\u0e40\u0e21\u0e29\u0e32\u0e22\u0e19",
            "\u0e1e\u0e24\u0e29\u0e20\u0e32\u0e04\u0e21",
            "\u0e21\u0e34\u0e16\u0e38\u0e19\u0e32\u0e22\u0e19",
            "\u0e01\u0e23\u0e01\u0e0e\u0e32\u0e04\u0e21",
            "\u0e2a\u0e34\u0e07\u0e2b\u0e32\u0e04\u0e21",
            "\u0e01\u0e31\u0e19\u0e22\u0e32\u0e22\u0e19",
            "\u0e15\u0e38\u0e25\u0e32\u0e04\u0e21",
            "\u0e1e\u0e24\u0e28\u0e08\u0e34\u0e01\u0e32\u0e22\u0e19",
            "\u0e18\u0e31\u0e19\u0e27\u0e32\u0e04\u0e21",
            "",
        };
        final String[] metaValue_MonthAbbreviations = new String[] {
            "\u0e21.\u0e04.",
            "\u0e01.\u0e1e.",
            "\u0e21\u0e35.\u0e04.",
            "\u0e40\u0e21.\u0e22.",
            "\u0e1e.\u0e04.",
            "\u0e21\u0e34.\u0e22.",
            "\u0e01.\u0e04.",
            "\u0e2a.\u0e04.",
            "\u0e01.\u0e22.",
            "\u0e15.\u0e04.",
            "\u0e1e.\u0e22.",
            "\u0e18.\u0e04.",
            "",
        };
        final String[] metaValue_generic_DayNames = new String[] {
            "\u0e27\u0e31\u0e19\u0e2d\u0e32\u0e17\u0e34\u0e15\u0e22\u0e4c",
            "\u0e27\u0e31\u0e19\u0e08\u0e31\u0e19\u0e17\u0e23\u0e4c",
            "\u0e27\u0e31\u0e19\u0e2d\u0e31\u0e07\u0e04\u0e32\u0e23",
            "\u0e27\u0e31\u0e19\u0e1e\u0e38\u0e18",
            "\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35",
            "\u0e27\u0e31\u0e19\u0e28\u0e38\u0e01\u0e23\u0e4c",
            "\u0e27\u0e31\u0e19\u0e40\u0e2a\u0e32\u0e23\u0e4c",
        };
        final String[] metaValue_generic_DayAbbreviations = new String[] {
            "\u0e2d\u0e32.",
            "\u0e08.",
            "\u0e2d.",
            "\u0e1e.",
            "\u0e1e\u0e24.",
            "\u0e28.",
            "\u0e2a.",
        };
        final String[] metaValue_generic_DayNarrows = new String[] {
            "\u0e2d\u0e32",
            "\u0e08",
            "\u0e2d",
            "\u0e1e",
            "\u0e1e\u0e24",
            "\u0e28",
            "\u0e2a",
        };
        final String[] metaValue_generic_QuarterNames = new String[] {
            "\u0e44\u0e15\u0e23\u0e21\u0e32\u0e2a 1",
            "\u0e44\u0e15\u0e23\u0e21\u0e32\u0e2a 2",
            "\u0e44\u0e15\u0e23\u0e21\u0e32\u0e2a 3",
            "\u0e44\u0e15\u0e23\u0e21\u0e32\u0e2a 4",
        };
        final String[] metaValue_generic_AmPmMarkers = new String[] {
            "\u0e01\u0e48\u0e2d\u0e19\u0e40\u0e17\u0e35\u0e48\u0e22\u0e07",
            "\u0e2b\u0e25\u0e31\u0e07\u0e40\u0e17\u0e35\u0e48\u0e22\u0e07",
            "\u0e40\u0e17\u0e35\u0e48\u0e22\u0e07\u0e04\u0e37\u0e19",
            "\u0e40\u0e17\u0e35\u0e48\u0e22\u0e07",
            "\u0e43\u0e19\u0e15\u0e2d\u0e19\u0e40\u0e0a\u0e49\u0e32",
            "",
            "\u0e43\u0e19\u0e15\u0e2d\u0e19\u0e1a\u0e48\u0e32\u0e22",
            "\u0e1a\u0e48\u0e32\u0e22",
            "\u0e43\u0e19\u0e15\u0e2d\u0e19\u0e40\u0e22\u0e47\u0e19",
            "\u0e04\u0e48\u0e33",
            "\u0e01\u0e25\u0e32\u0e07\u0e04\u0e37\u0e19",
            "",
        };
        final String[] metaValue_generic_narrow_AmPmMarkers = new String[] {
            "a",
            "p",
            "\u0e40\u0e17\u0e35\u0e48\u0e22\u0e07\u0e04\u0e37\u0e19",
            "\u0e40\u0e17\u0e35\u0e48\u0e22\u0e07",
            "\u0e40\u0e0a\u0e49\u0e32",
            "",
            "\u0e40\u0e17\u0e35\u0e48\u0e22\u0e07",
            "\u0e1a\u0e48\u0e32\u0e22",
            "\u0e40\u0e22\u0e47\u0e19",
            "\u0e04\u0e48\u0e33",
            "\u0e01\u0e25\u0e32\u0e07\u0e04\u0e37\u0e19",
            "",
        };
        final String[] metaValue_generic_abbreviated_AmPmMarkers = new String[] {
            "AM",
            "PM",
            "\u0e40\u0e17\u0e35\u0e48\u0e22\u0e07\u0e04\u0e37\u0e19",
            "\u0e40\u0e17\u0e35\u0e48\u0e22\u0e07",
            "\u0e43\u0e19\u0e15\u0e2d\u0e19\u0e40\u0e0a\u0e49\u0e32",
            "",
            "\u0e43\u0e19\u0e15\u0e2d\u0e19\u0e1a\u0e48\u0e32\u0e22",
            "\u0e1a\u0e48\u0e32\u0e22",
            "\u0e43\u0e19\u0e15\u0e2d\u0e19\u0e40\u0e22\u0e47\u0e19",
            "\u0e04\u0e48\u0e33",
            "\u0e01\u0e25\u0e32\u0e07\u0e04\u0e37\u0e19",
            "",
        };
        final String[] metaValue_java_time_long_Eras = new String[] {
            "\u0e1b\u0e35\u0e01\u0e48\u0e2d\u0e19\u0e04\u0e23\u0e34\u0e2a\u0e15\u0e01\u0e32\u0e25",
            "\u0e04\u0e23\u0e34\u0e2a\u0e15\u0e4c\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a",
        };
        final String[] metaValue_java_time_Eras = new String[] {
            "\u0e01\u0e48\u0e2d\u0e19 \u0e04.\u0e28.",
            "\u0e04.\u0e28.",
        };
        final String[] metaValue_generic_TimePatterns = new String[] {
            "H \u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32 mm \u0e19\u0e32\u0e17\u0e35 ss \u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 zzzz",
            "H \u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32 mm \u0e19\u0e32\u0e17\u0e35 ss \u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 z",
            "HH:mm:ss",
            "HH:mm",
        };
        final String[] metaValue_generic_DateTimePatterns = new String[] {
            "{1} {0}",
            "{1} {0}",
            "{1} {0}",
            "{1} {0}",
        };
        final String metaValue_generic_DateFormatItem_MMMMEEEEd = "EEEE\u0e17\u0e35\u0e48 d MMMM";
        final String metaValue_generic_DateFormatItem_hmv = "h:mm \u0e19. a v";
        final String metaValue_generic_DateFormatItem_yMMMMEEEEd = "EEEE\u0e17\u0e35\u0e48 d MMMM y";
        final String metaValue_generic_DateFormatItem_yw = "\u0e2a\u0e31\u0e1b\u0e14\u0e32\u0e2b\u0e4c\u0e17\u0e35\u0e48 w \u0e02\u0e2d\u0e07\u0e1b\u0e35 Y";
        final String metaValue_generic_DateFormatItem_yQQQ = "QQQ y";
        final String metaValue_generic_DateFormatItem_yMMMMEd = "E d MMMM y";
        final String metaValue_generic_DateFormatItem_Hm = "HH:mm \u0e19.";
        final String metaValue_generic_DateFormatItem_EHm = "E HH:mm \u0e19.";
        final String metaValue_generic_DateFormatItem_mmss = "mm:ss";
        final String metaValue_generic_DateFormatItem_MMMMEd = "E d MMMM";
        final String metaValue_generic_DateFormatItem_MMMMd = "d MMMM";
        final String metaValue_generic_DateFormatItem_MMMEd = "E d MMM";
        final String metaValue_generic_DateFormatItem_GyMd = "d/M/GGGGG y";
        final String metaValue_generic_DateFormatItem_MMMd = "d MMM";
        final String metaValue_generic_DateFormatItem_MMMMW = "\u0e2a\u0e31\u0e1b\u0e14\u0e32\u0e2b\u0e4c\u0e17\u0e35\u0e48 W \u0e02\u0e2d\u0e07\u0e40\u0e14\u0e37\u0e2d\u0e19MMMM";
        final String metaValue_generic_DateFormatItem_yMMMEd = "E d MMM y";
        final String metaValue_generic_DateFormatItem_yMEd = "E d/M/y";
        final String metaValue_generic_DateFormatItem_yMMMMd = "d MMMM y";
        final String metaValue_generic_DateFormatItem_yMMMd = "d MMM y";
        final String metaValue_generic_DateFormatItem_yMMM = "MMM y";
        final String metaValue_generic_DateFormatItem_yMMMEEEEd = "EEEE\u0e17\u0e35\u0e48 d MMM y";
        final String metaValue_generic_DateFormatItem_Md = "d/M";
        final String metaValue_generic_DateFormatItem_Ed = "E d";
        final String metaValue_generic_DateFormatItem_MEd = "E d/M";
        final String metaValue_generic_DateFormatItem_MMMEEEEd = "EEEE\u0e17\u0e35\u0e48 d MMM";
        final String metaValue_generic_DateFormatItem_yMd = "d/M/y";
        final String metaValue_generic_DateFormatItem_yM = "M/y";
        final String metaValue_generic_DateFormatItem_yMMMM = "MMMM y";
        final String[] metaValue_java_time_buddhist_long_Eras = new String[] {
            "BC",
            "\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a",
        };
        final String[] metaValue_java_time_buddhist_Eras = new String[] {
            "BC",
            "\u0e1e.\u0e28.",
        };
        final String[] metaValue_java_time_japanese_long_Eras = new String[] {
            "\u0e04\u0e23\u0e34\u0e2a\u0e15\u0e4c\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a",
            "\u0e40\u0e21\u0e08\u0e34",
            "\u0e17\u0e30\u0e2d\u0e34\u0e42\u0e0a",
            "\u0e42\u0e0a\u0e27\u0e30",
            "\u0e40\u0e2e\u0e40\u0e0b",
            "\u0e40\u0e23\u0e27\u0e30",
        };
        final String[] metaValue_java_time_japanese_Eras = new String[] {
            "\u0e04.\u0e28.",
            "\u0e40\u0e21\u0e08\u0e34",
            "\u0e17\u0e30\u0e2d\u0e34\u0e42\u0e0a",
            "\u0e42\u0e0a\u0e27\u0e30",
            "\u0e40\u0e2e\u0e40\u0e0b",
            "\u0e40\u0e23\u0e27\u0e30",
        };
        final String[] metaValue_java_time_roc_long_Eras = new String[] {
            "\u0e1b\u0e35\u0e01\u0e48\u0e2d\u0e19\u0e44\u0e15\u0e49\u0e2b\u0e27\u0e31\u0e19",
            "\u0e44\u0e15\u0e49\u0e2b\u0e27\u0e31\u0e19",
        };
        final String metaValue_roc_DateFormatItem_Gy = "\u0e1b\u0e35G\u0e17\u0e35\u0e48 y";
        final String metaValue_japanese_DateFormatItem_yyyyMEd = "E d/M/GGGGG y";
        final String metaValue_japanese_DateFormatItem_yyyyM = "M/GGGGG y";
        final String[] metaValue_java_time_islamic_long_Eras = new String[] {
            "",
            "\u0e2e\u0e34\u0e08\u0e40\u0e23\u0e32\u0e30\u0e2b\u0e4c\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a",
        };
        final String[] metaValue_java_time_islamic_Eras = new String[] {
            "",
            "\u0e2e.\u0e28.",
        };
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "EEEE\u0e17\u0e35\u0e48 d MMMM G y",
            "d MMMM G y",
            "d MMM G y",
            "d/M/y G",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "EEEE\u0e17\u0e35\u0e48 d MMMM GGGG y",
            "d MMMM GGGG y",
            "d MMM GGGG y",
            "d/M/y GGGG",
        };
        final String metaValue_calendarname_gregorian = "\u0e1b\u0e0f\u0e34\u0e17\u0e34\u0e19\u0e40\u0e01\u0e23\u0e01\u0e2d\u0e40\u0e23\u0e35\u0e22\u0e19";
        final String[] metaValue_ListPatterns_standard = new String[] {
            "{0} {1}",
            "{0} {1}",
            "{0} \u0e41\u0e25\u0e30{1}",
            "{0}\u0e41\u0e25\u0e30{1}",
            "",
        };
        final String[] metaValue_ListPatterns_or = new String[] {
            "",
            "",
            "{0} \u0e2b\u0e23\u0e37\u0e2d {1}",
            "{0} \u0e2b\u0e23\u0e37\u0e2d {1}",
            "",
        };
        final Object[][] data = new Object[][] {
            { "generic.DayNames", metaValue_generic_DayNames },
            { "generic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "generic.DayNarrows", metaValue_generic_DayNarrows },
            { "generic.QuarterNames", metaValue_generic_QuarterNames },
            { "generic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "generic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "generic.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "generic.DateTimePatterns", metaValue_generic_DateTimePatterns },
            { "generic.DateFormatItem.MMMMEEEEd", metaValue_generic_DateFormatItem_MMMMEEEEd },
            { "generic.DateFormatItem.yyyyMMMM", "MMMM G y" },
            { "generic.DateFormatItem.yyyyQQQQ", metaValue_generic_DateFormatItem_yyyyQQQQ },
            { "generic.DateFormatItem.yyyyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "generic.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "generic.DateFormatItem.yMMMMEEEEd", metaValue_generic_DateFormatItem_yMMMMEEEEd },
            { "generic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "generic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "generic.DateFormatItem.yMMMMEd", metaValue_generic_DateFormatItem_yMMMMEd },
            { "generic.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "generic.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "generic.DateFormatItem.mmss", metaValue_generic_DateFormatItem_mmss },
            { "generic.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "generic.DateFormatItem.yyyyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "generic.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "generic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "generic.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "generic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "generic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "generic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "generic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "generic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "generic.DateFormatItem.yMMMMd", metaValue_generic_DateFormatItem_yMMMMd },
            { "generic.DateFormatItem.yyyyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "generic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "generic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "generic.DateFormatItem.yyyyMEd", "E d/M/y GGGGG" },
            { "generic.DateFormatItem.GyMMMEEEEd", metaValue_generic_DateFormatItem_GyMMMEEEEd },
            { "generic.DateFormatItem.yyyyMd", "d/M/y GGGGG" },
            { "generic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "generic.DateFormatItem.yMMMEEEEd", metaValue_generic_DateFormatItem_yMMMEEEEd },
            { "generic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "generic.DateFormatItem.yyyyMMMEEEEd", metaValue_generic_DateFormatItem_GyMMMEEEEd },
            { "generic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "generic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "generic.DateFormatItem.MMMEEEEd", metaValue_generic_DateFormatItem_MMMEEEEd },
            { "generic.DateFormatItem.yyyyQQQ", "QQQ G y" },
            { "generic.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "generic.DateFormatItem.yyyyM", "M/y G" },
            { "generic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "generic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "generic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "generic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yyyyQQQQ },
            { "MonthNames", metaValue_MonthNames },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "standalone.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "MonthNarrows", metaValue_MonthAbbreviations },
            { "standalone.MonthNarrows", metaValue_MonthAbbreviations },
            { "DayNames", metaValue_generic_DayNames },
            { "standalone.DayNames", metaValue_generic_DayNames },
            { "DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "standalone.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "DayNarrows", metaValue_generic_DayNarrows },
            { "standalone.DayNarrows", metaValue_generic_DayNarrows },
            { "QuarterNames", metaValue_generic_QuarterNames },
            { "standalone.QuarterNames", metaValue_generic_QuarterNames },
            { "QuarterAbbreviations", metaValue_generic_QuarterNames },
            { "AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "java.time.long.Eras", metaValue_java_time_long_Eras },
            { "long.Eras", metaValue_java_time_long_Eras },
            { "java.time.Eras", metaValue_java_time_Eras },
            { "Eras", metaValue_java_time_Eras },
            { "java.time.narrow.Eras", metaValue_java_time_Eras },
            { "narrow.Eras", metaValue_java_time_Eras },
            { "field.era", "\u0e2a\u0e21\u0e31\u0e22" },
            { "field.year", "\u0e1b\u0e35" },
            { "field.month", "\u0e40\u0e14\u0e37\u0e2d\u0e19" },
            { "field.week", "\u0e2a\u0e31\u0e1b\u0e14\u0e32\u0e2b\u0e4c" },
            { "field.weekday", "\u0e27\u0e31\u0e19\u0e02\u0e2d\u0e07\u0e2a\u0e31\u0e1b\u0e14\u0e32\u0e2b\u0e4c" },
            { "field.dayperiod", "\u0e0a\u0e48\u0e27\u0e07\u0e27\u0e31\u0e19" },
            { "field.hour", "\u0e0a\u0e31\u0e48\u0e27\u0e42\u0e21\u0e07" },
            { "timezone.regionFormat", "\u0e40\u0e27\u0e25\u0e32{0}" },
            { "timezone.regionFormat.daylight", "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e2d\u0e21\u0e41\u0e2a\u0e07{0}" },
            { "timezone.regionFormat.standard", "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19{0}" },
            { "field.minute", "\u0e19\u0e32\u0e17\u0e35" },
            { "field.second", "\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35" },
            { "field.zone", "\u0e40\u0e02\u0e15\u0e40\u0e27\u0e25\u0e32" },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "DatePatterns",
                new String[] {
                    "EEEE\u0e17\u0e35\u0e48 d MMMM G y",
                    "d MMMM G y",
                    "d MMM y",
                    "d/M/yy",
                }
            },
            { "DateTimePatterns", metaValue_generic_DateTimePatterns },
            { "DayPeriodRules", "midnight:00:00;noon:12:00;evening2:18:00-21:00;night1:21:00-06:00;afternoon1:12:00-13:00;morning1:06:00-12:00;afternoon2:13:00-16:00;evening1:16:00-18:00" },
            { "DateFormatItem.MMMMEEEEd", metaValue_generic_DateFormatItem_MMMMEEEEd },
            { "DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "DateFormatItem.yMMMMEEEEd", metaValue_generic_DateFormatItem_yMMMMEEEEd },
            { "DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "DateFormatItem.yMMMMEd", metaValue_generic_DateFormatItem_yMMMMEd },
            { "DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "DateFormatItem.mmss", metaValue_generic_DateFormatItem_mmss },
            { "DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DateFormatItem.yMMMMd", metaValue_generic_DateFormatItem_yMMMMd },
            { "DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "DateFormatItem.GyMMMEEEEd", metaValue_generic_DateFormatItem_GyMMMEEEEd },
            { "DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "DateFormatItem.yMMMEEEEd", metaValue_generic_DateFormatItem_yMMMEEEEd },
            { "DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "DateFormatItem.MMMEEEEd", metaValue_generic_DateFormatItem_MMMEEEEd },
            { "DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yyyyQQQQ },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "buddhist.DayNames", metaValue_generic_DayNames },
            { "buddhist.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "buddhist.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "java.time.buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "java.time.buddhist.Eras", metaValue_java_time_buddhist_Eras },
            { "buddhist.Eras", metaValue_java_time_buddhist_Eras },
            { "java.time.buddhist.narrow.Eras", metaValue_java_time_buddhist_Eras },
            { "buddhist.narrow.Eras", metaValue_java_time_buddhist_Eras },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.buddhist.DatePatterns",
                new String[] {
                    "EEEE\u0e17\u0e35\u0e48 d MMMM G y",
                    "d MMMM y",
                    "d MMM y",
                    "d/M/yy",
                }
            },
            { "buddhist.DatePatterns",
                new String[] {
                    "EEEE\u0e17\u0e35\u0e48 d MMMM GGGG y",
                    "d MMMM y",
                    "d MMM y",
                    "d/M/yy",
                }
            },
            { "buddhist.DateFormatItem.MMMMEEEEd", metaValue_generic_DateFormatItem_MMMMEEEEd },
            { "buddhist.DateFormatItem.yyyyMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "buddhist.DateFormatItem.yyyyQQQQ", "QQQQ y" },
            { "buddhist.DateFormatItem.yyyyMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "buddhist.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "buddhist.DateFormatItem.yMMMMEEEEd", metaValue_generic_DateFormatItem_yMMMMEEEEd },
            { "buddhist.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "buddhist.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "buddhist.DateFormatItem.yMMMMEd", metaValue_generic_DateFormatItem_yMMMMEd },
            { "buddhist.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "buddhist.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "buddhist.DateFormatItem.mmss", metaValue_generic_DateFormatItem_mmss },
            { "buddhist.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "buddhist.DateFormatItem.yyyyMMM", metaValue_generic_DateFormatItem_yMMM },
            { "buddhist.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "buddhist.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "buddhist.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "buddhist.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "buddhist.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "buddhist.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.yMMMMd", metaValue_generic_DateFormatItem_yMMMMd },
            { "buddhist.DateFormatItem.yyyyMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "buddhist.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "buddhist.DateFormatItem.yyyyMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.GyMMMEEEEd", metaValue_generic_DateFormatItem_GyMMMEEEEd },
            { "buddhist.DateFormatItem.yyyyMd", metaValue_generic_DateFormatItem_yMd },
            { "buddhist.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "buddhist.DateFormatItem.yMMMEEEEd", metaValue_generic_DateFormatItem_yMMMEEEEd },
            { "buddhist.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "buddhist.DateFormatItem.yyyyMMMEEEEd", metaValue_generic_DateFormatItem_yMMMEEEEd },
            { "buddhist.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "buddhist.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DateFormatItem.MMMEEEEd", metaValue_generic_DateFormatItem_MMMEEEEd },
            { "buddhist.DateFormatItem.yyyyQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "buddhist.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "buddhist.DateFormatItem.yyyyM", metaValue_generic_DateFormatItem_yM },
            { "buddhist.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "buddhist.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "buddhist.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "buddhist.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yyyyQQQQ },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "japanese.DayNames", metaValue_generic_DayNames },
            { "japanese.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "japanese.QuarterNames", metaValue_generic_QuarterNames },
            { "japanese.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "japanese.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "japanese.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "java.time.japanese.long.Eras", metaValue_java_time_japanese_long_Eras },
            { "japanese.long.Eras", metaValue_java_time_japanese_long_Eras },
            { "java.time.japanese.Eras", metaValue_java_time_japanese_Eras },
            { "japanese.Eras", metaValue_java_time_japanese_Eras },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.japanese.DatePatterns",
                new String[] {
                    "EEEE\u0e17\u0e35\u0e48 d MMMM \u0e1b\u0e35G\u0e17\u0e35\u0e48 y",
                    "d MMMM \u0e1b\u0e35G y",
                    "d MMM G y",
                    "d/M/yy G",
                }
            },
            { "japanese.DatePatterns",
                new String[] {
                    "EEEE\u0e17\u0e35\u0e48 d MMMM \u0e1b\u0e35GGGG\u0e17\u0e35\u0e48 y",
                    "d MMMM \u0e1b\u0e35GGGG y",
                    "d MMM GGGG y",
                    "d/M/yy GGGG",
                }
            },
            { "japanese.DateTimePatterns", metaValue_generic_DateTimePatterns },
            { "japanese.DateFormatItem.MMMMEEEEd", metaValue_generic_DateFormatItem_MMMMEEEEd },
            { "japanese.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "japanese.DateFormatItem.yMMMMEEEEd", metaValue_generic_DateFormatItem_yMMMMEEEEd },
            { "japanese.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "japanese.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.yMMMMEd", metaValue_generic_DateFormatItem_yMMMMEd },
            { "japanese.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "japanese.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "japanese.DateFormatItem.mmss", metaValue_generic_DateFormatItem_mmss },
            { "japanese.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "japanese.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "japanese.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "japanese.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "japanese.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "japanese.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "japanese.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "japanese.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.DateFormatItem.yMMMMd", metaValue_generic_DateFormatItem_yMMMMd },
            { "japanese.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "japanese.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "japanese.DateFormatItem.yyyyMEd", metaValue_japanese_DateFormatItem_yyyyMEd },
            { "japanese.DateFormatItem.GyMMMEEEEd", metaValue_generic_DateFormatItem_GyMMMEEEEd },
            { "japanese.DateFormatItem.yyyyMd", metaValue_generic_DateFormatItem_GyMd },
            { "japanese.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "japanese.DateFormatItem.yMMMEEEEd", metaValue_generic_DateFormatItem_yMMMEEEEd },
            { "japanese.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "japanese.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "japanese.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.DateFormatItem.MMMEEEEd", metaValue_generic_DateFormatItem_MMMEEEEd },
            { "japanese.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "japanese.DateFormatItem.yyyyM", metaValue_japanese_DateFormatItem_yyyyM },
            { "japanese.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "japanese.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "japanese.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "japanese.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yyyyQQQQ },
            { "roc.MonthNames", metaValue_MonthNames },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "roc.DayNames", metaValue_generic_DayNames },
            { "roc.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "roc.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.QuarterNames", metaValue_generic_QuarterNames },
            { "roc.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "roc.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "java.time.roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "java.time.roc.Eras", metaValue_java_time_roc_long_Eras },
            { "roc.Eras", metaValue_java_time_roc_long_Eras },
            { "java.time.roc.narrow.Eras", metaValue_java_time_roc_long_Eras },
            { "roc.narrow.Eras", metaValue_java_time_roc_long_Eras },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.roc.DatePatterns",
                new String[] {
                    "EEEE\u0e17\u0e35\u0e48 d MMMM \u0e1b\u0e35G\u0e17\u0e35\u0e48 y",
                    "d MMMM \u0e1b\u0e35G y",
                    "d MMM G y",
                    "d/M/y G",
                }
            },
            { "roc.DatePatterns",
                new String[] {
                    "EEEE\u0e17\u0e35\u0e48 d MMMM \u0e1b\u0e35GGGG\u0e17\u0e35\u0e48 y",
                    "d MMMM \u0e1b\u0e35GGGG y",
                    "d MMM GGGG y",
                    "d/M/y GGGG",
                }
            },
            { "roc.DateFormatItem.MMMMEEEEd", metaValue_generic_DateFormatItem_MMMMEEEEd },
            { "roc.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "roc.DateFormatItem.Gy", metaValue_roc_DateFormatItem_Gy },
            { "roc.DateFormatItem.yMMMMEEEEd", metaValue_generic_DateFormatItem_yMMMMEEEEd },
            { "roc.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "roc.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "roc.DateFormatItem.yMMMMEd", metaValue_generic_DateFormatItem_yMMMMEd },
            { "roc.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "roc.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "roc.DateFormatItem.mmss", metaValue_generic_DateFormatItem_mmss },
            { "roc.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "roc.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "roc.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "roc.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "roc.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "roc.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "roc.DateFormatItem.yyyy", metaValue_roc_DateFormatItem_Gy },
            { "roc.DateFormatItem.y", metaValue_roc_DateFormatItem_Gy },
            { "roc.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "roc.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "roc.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "roc.DateFormatItem.yMMMMd", metaValue_generic_DateFormatItem_yMMMMd },
            { "roc.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "roc.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "roc.DateFormatItem.yyyyMEd", metaValue_japanese_DateFormatItem_yyyyMEd },
            { "roc.DateFormatItem.GyMMMEEEEd", metaValue_generic_DateFormatItem_GyMMMEEEEd },
            { "roc.DateFormatItem.yyyyMd", metaValue_generic_DateFormatItem_GyMd },
            { "roc.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "roc.DateFormatItem.yMMMEEEEd", metaValue_generic_DateFormatItem_yMMMEEEEd },
            { "roc.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "roc.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "roc.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "roc.DateFormatItem.MMMEEEEd", metaValue_generic_DateFormatItem_MMMEEEEd },
            { "roc.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "roc.DateFormatItem.yyyyM", metaValue_japanese_DateFormatItem_yyyyM },
            { "roc.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "roc.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "roc.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "roc.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yyyyQQQQ },
            { "islamic.MonthNames",
                new String[] {
                    "\u0e21\u0e38\u0e2e\u0e30\u0e23\u0e4c\u0e23\u0e2d\u0e21",
                    "\u0e0b\u0e2d\u0e1f\u0e32\u0e23\u0e4c",
                    "\u0e23\u0e2d\u0e1a\u0e35 I",
                    "\u0e23\u0e2d\u0e1a\u0e35 II",
                    "\u0e08\u0e38\u0e21\u0e32\u0e14\u0e32 I",
                    "\u0e08\u0e38\u0e21\u0e32\u0e14\u0e32 II",
                    "\u0e23\u0e2d\u0e08\u0e31\u0e1a",
                    "\u0e0a\u0e30\u0e2d\u0e30\u0e1a\u0e32\u0e19",
                    "\u0e23\u0e2d\u0e21\u0e30\u0e14\u0e2d\u0e19",
                    "\u0e40\u0e0a\u0e32\u0e27\u0e31\u0e25",
                    "\u0e0b\u0e38\u0e25\u0e01\u0e34\u0e2d\u0e3a\u0e14\u0e30\u0e2e\u0e3a",
                    "\u0e0b\u0e38\u0e25\u0e2b\u0e34\u0e08\u0e0d\u0e30\u0e2e\u0e3a",
                    "",
                }
            },
            { "islamic.MonthAbbreviations",
                new String[] {
                    "\u0e21\u0e38\u0e2e\u0e31\u0e23.",
                    "\u0e40\u0e28\u0e32\u0e30.",
                    "\u0e23\u0e2d\u0e1a\u0e35 I",
                    "\u0e23\u0e2d\u0e1a\u0e35 II",
                    "\u0e08\u0e38\u0e21\u0e32\u0e14\u0e32 I",
                    "\u0e08\u0e38\u0e21\u0e32\u0e14\u0e32 II",
                    "\u0e40\u0e23\u0e32\u0e30.",
                    "\u0e0a\u0e30\u0e2d\u0e4c.",
                    "\u0e40\u0e23\u0e32\u0e30\u0e21\u0e30.",
                    "\u0e40\u0e0a\u0e32\u0e27.",
                    "\u0e0b\u0e38\u0e25\u0e01\u0e34\u0e2d\u0e3a.",
                    "\u0e0b\u0e38\u0e25\u0e2b\u0e34\u0e08.",
                    "",
                }
            },
            { "islamic.DayNames", metaValue_generic_DayNames },
            { "islamic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "java.time.islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "java.time.islamic.Eras", metaValue_java_time_islamic_Eras },
            { "islamic.Eras", metaValue_java_time_islamic_Eras },
            { "java.time.islamic.narrow.Eras", metaValue_java_time_islamic_Eras },
            { "islamic.narrow.Eras", metaValue_java_time_islamic_Eras },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.islamic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "islamic.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic.DateFormatItem.MMMMEEEEd", metaValue_generic_DateFormatItem_MMMMEEEEd },
            { "islamic.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "islamic.DateFormatItem.yMMMMEEEEd", metaValue_generic_DateFormatItem_yMMMMEEEEd },
            { "islamic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic.DateFormatItem.yMMMMEd", metaValue_generic_DateFormatItem_yMMMMEd },
            { "islamic.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "islamic.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "islamic.DateFormatItem.mmss", metaValue_generic_DateFormatItem_mmss },
            { "islamic.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "islamic.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic.DateFormatItem.yMMMMd", metaValue_generic_DateFormatItem_yMMMMd },
            { "islamic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic.DateFormatItem.GyMMMEEEEd", metaValue_generic_DateFormatItem_GyMMMEEEEd },
            { "islamic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic.DateFormatItem.yMMMEEEEd", metaValue_generic_DateFormatItem_yMMMEEEEd },
            { "islamic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic.DateFormatItem.MMMEEEEd", metaValue_generic_DateFormatItem_MMMEEEEd },
            { "islamic.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yyyyQQQQ },
            { "islamic-civil.DateFormatItem.MMMMEEEEd", metaValue_generic_DateFormatItem_MMMMEEEEd },
            { "islamic-civil.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "islamic-civil.DateFormatItem.yMMMMEEEEd", metaValue_generic_DateFormatItem_yMMMMEEEEd },
            { "islamic-civil.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-civil.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-civil.DateFormatItem.yMMMMEd", metaValue_generic_DateFormatItem_yMMMMEd },
            { "islamic-civil.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "islamic-civil.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "islamic-civil.DateFormatItem.mmss", metaValue_generic_DateFormatItem_mmss },
            { "islamic-civil.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "islamic-civil.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic-civil.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-civil.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic-civil.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic-civil.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic-civil.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-civil.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-civil.DateFormatItem.yMMMMd", metaValue_generic_DateFormatItem_yMMMMd },
            { "islamic-civil.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic-civil.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-civil.DateFormatItem.GyMMMEEEEd", metaValue_generic_DateFormatItem_GyMMMEEEEd },
            { "islamic-civil.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-civil.DateFormatItem.yMMMEEEEd", metaValue_generic_DateFormatItem_yMMMEEEEd },
            { "islamic-civil.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-civil.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic-civil.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-civil.DateFormatItem.MMMEEEEd", metaValue_generic_DateFormatItem_MMMEEEEd },
            { "islamic-civil.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic-civil.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-civil.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic-civil.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic-civil.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yyyyQQQQ },
            { "islamic-umalqura.DateFormatItem.MMMMEEEEd", metaValue_generic_DateFormatItem_MMMMEEEEd },
            { "islamic-umalqura.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "islamic-umalqura.DateFormatItem.yMMMMEEEEd", metaValue_generic_DateFormatItem_yMMMMEEEEd },
            { "islamic-umalqura.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-umalqura.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-umalqura.DateFormatItem.yMMMMEd", metaValue_generic_DateFormatItem_yMMMMEd },
            { "islamic-umalqura.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "islamic-umalqura.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "islamic-umalqura.DateFormatItem.mmss", metaValue_generic_DateFormatItem_mmss },
            { "islamic-umalqura.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "islamic-umalqura.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic-umalqura.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-umalqura.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic-umalqura.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-umalqura.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic-umalqura.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic-umalqura.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-umalqura.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-umalqura.DateFormatItem.yMMMMd", metaValue_generic_DateFormatItem_yMMMMd },
            { "islamic-umalqura.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic-umalqura.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-umalqura.DateFormatItem.GyMMMEEEEd", metaValue_generic_DateFormatItem_GyMMMEEEEd },
            { "islamic-umalqura.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-umalqura.DateFormatItem.yMMMEEEEd", metaValue_generic_DateFormatItem_yMMMEEEEd },
            { "islamic-umalqura.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic-umalqura.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-umalqura.DateFormatItem.MMMEEEEd", metaValue_generic_DateFormatItem_MMMEEEEd },
            { "islamic-umalqura.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic-umalqura.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-umalqura.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic-umalqura.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic-umalqura.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yyyyQQQQ },
            { "calendarname.islamic-civil", "\u0e1b\u0e0f\u0e34\u0e17\u0e34\u0e19\u0e2d\u0e34\u0e2a\u0e25\u0e32\u0e21\u0e0b\u0e35\u0e27\u0e34\u0e25" },
            { "calendarname.islamic", "\u0e1b\u0e0f\u0e34\u0e17\u0e34\u0e19\u0e2d\u0e34\u0e2a\u0e25\u0e32\u0e21" },
            { "calendarname.buddhist", "\u0e1b\u0e0f\u0e34\u0e17\u0e34\u0e19\u0e1e\u0e38\u0e17\u0e18" },
            { "calendarname.japanese", "\u0e1b\u0e0f\u0e34\u0e17\u0e34\u0e19\u0e0d\u0e35\u0e48\u0e1b\u0e38\u0e48\u0e19" },
            { "calendarname.roc", "\u0e1b\u0e0f\u0e34\u0e17\u0e34\u0e19\u0e44\u0e15\u0e49\u0e2b\u0e27\u0e31\u0e19" },
            { "calendarname.islamic-umalqura", "\u0e1b\u0e0f\u0e34\u0e17\u0e34\u0e19\u0e2d\u0e34\u0e2a\u0e25\u0e32\u0e21 (\u0e2d\u0e38\u0e21\u0e21\u0e4c\u0e2d\u0e31\u0e25\u0e01\u0e38\u0e23\u0e32)" },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
            { "latn.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                    "",
                    "",
                }
            },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "\u00a4#,##0.00",
                    "#,##0%",
                    "\u00a4#,##0.00;(\u00a4#,##0.00)",
                }
            },
            { "short.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{other:0K}",
                    "{other:00K}",
                    "{other:000K}",
                    "{other:0M}",
                    "{other:00M}",
                    "{other:000M}",
                    "{other:0B}",
                    "{other:00B}",
                    "{other:000B}",
                    "{other:0T}",
                    "{other:00T}",
                    "{other:000T}",
                }
            },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{other:0' '\u0e1e\u0e31\u0e19}",
                    "{other:0' '\u0e2b\u0e21\u0e37\u0e48\u0e19}",
                    "{other:0' '\u0e41\u0e2a\u0e19}",
                    "{other:0' '\u0e25\u0e49\u0e32\u0e19}",
                    "{other:00' '\u0e25\u0e49\u0e32\u0e19}",
                    "{other:000' '\u0e25\u0e49\u0e32\u0e19}",
                    "{other:0' '\u0e1e\u0e31\u0e19\u0e25\u0e49\u0e32\u0e19}",
                    "{other:0' '\u0e2b\u0e21\u0e37\u0e48\u0e19\u0e25\u0e49\u0e32\u0e19}",
                    "{other:0' '\u0e41\u0e2a\u0e19\u0e25\u0e49\u0e32\u0e19}",
                    "{other:0' '\u0e25\u0e49\u0e32\u0e19\u0e25\u0e49\u0e32\u0e19}",
                    "{other:00' '\u0e25\u0e49\u0e32\u0e19\u0e25\u0e49\u0e32\u0e19}",
                    "{other:000' '\u0e25\u0e49\u0e32\u0e19\u0e25\u0e49\u0e32\u0e19}",
                }
            },
            { "ListPatterns_standard", metaValue_ListPatterns_standard },
            { "ListPatterns_standard-short", metaValue_ListPatterns_standard },
            { "ListPatterns_standard-narrow", metaValue_ListPatterns_standard },
            { "ListPatterns_or", metaValue_ListPatterns_or },
            { "ListPatterns_or-short",
                new String[] {
                    "",
                    "",
                    "{0} \u0e2b\u0e23\u0e37\u0e2d {1}",
                    "{0}\u0e2b\u0e23\u0e37\u0e2d{1}",
                    "",
                }
            },
            { "ListPatterns_or-narrow", metaValue_ListPatterns_or },
            { "ListPatterns_unit",
                new String[] {
                    "{0} {1}",
                    "{0} {1}",
                    "{0} \u0e41\u0e25\u0e30{1}",
                    "{0} \u0e41\u0e25\u0e30 {1}",
                    "",
                }
            },
            { "ListPatterns_unit-short",
                new String[] {
                    "{0} {1}",
                    "{0} {1}",
                    "{0} \u0e41\u0e25\u0e30 {1}",
                    "{0} {1}",
                    "",
                }
            },
            { "ListPatterns_unit-narrow",
                new String[] {
                    "{0} {1}",
                    "{0} {1}",
                    "{0} {1}",
                    "{0}\u0e41\u0e25\u0e30{1}",
                    "",
                }
            },
        };
        return data;
    }
}
