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

public class FormatData_ru extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String metaValue_generic_DateFormatItem_Gy = "y\u202f'\u0433'. G";
        final String metaValue_generic_DateFormatItem_yyyyMMM = "LLL y\u202f'\u0433'. G";
        final String metaValue_generic_DateFormatItem_yyyyMMMd = "d MMM y\u202f'\u0433'. G";
        final String metaValue_generic_DateFormatItem_MMdd = "dd.MM";
        final String metaValue_generic_DateFormatItem_yyyyMMMEd = "E, d MMM y\u202f'\u0433'. G";
        final String metaValue_generic_DateFormatItem_yMM = "MM.y";
        final String[] metaValue_MonthNarrows = new String[] {
            "\u042f",
            "\u0424",
            "\u041c",
            "\u0410",
            "\u041c",
            "\u0418",
            "\u0418",
            "\u0410",
            "\u0421",
            "\u041e",
            "\u041d",
            "\u0414",
            "",
        };
        final String[] metaValue_generic_DayNames = new String[] {
            "\u0432\u043e\u0441\u043a\u0440\u0435\u0441\u0435\u043d\u044c\u0435",
            "\u043f\u043e\u043d\u0435\u0434\u0435\u043b\u044c\u043d\u0438\u043a",
            "\u0432\u0442\u043e\u0440\u043d\u0438\u043a",
            "\u0441\u0440\u0435\u0434\u0430",
            "\u0447\u0435\u0442\u0432\u0435\u0440\u0433",
            "\u043f\u044f\u0442\u043d\u0438\u0446\u0430",
            "\u0441\u0443\u0431\u0431\u043e\u0442\u0430",
        };
        final String[] metaValue_generic_DayAbbreviations = new String[] {
            "\u0432\u0441",
            "\u043f\u043d",
            "\u0432\u0442",
            "\u0441\u0440",
            "\u0447\u0442",
            "\u043f\u0442",
            "\u0441\u0431",
        };
        final String[] metaValue_generic_DayNarrows = new String[] {
            "\u0412",
            "\u041f",
            "\u0412",
            "\u0421",
            "\u0427",
            "\u041f",
            "\u0421",
        };
        final String[] metaValue_generic_QuarterNames = new String[] {
            "1-\u0439 \u043a\u0432\u0430\u0440\u0442\u0430\u043b",
            "2-\u0439 \u043a\u0432\u0430\u0440\u0442\u0430\u043b",
            "3-\u0439 \u043a\u0432\u0430\u0440\u0442\u0430\u043b",
            "4-\u0439 \u043a\u0432\u0430\u0440\u0442\u0430\u043b",
        };
        final String[] metaValue_generic_QuarterAbbreviations = new String[] {
            "1-\u0439 \u043a\u0432.",
            "2-\u0439 \u043a\u0432.",
            "3-\u0439 \u043a\u0432.",
            "4-\u0439 \u043a\u0432.",
        };
        final String[] metaValue_generic_AmPmMarkers = new String[] {
            "AM",
            "PM",
            "\u043f\u043e\u043b\u043d\u043e\u0447\u044c",
            "\u043f\u043e\u043b\u0434\u0435\u043d\u044c",
            "\u0443\u0442\u0440\u0430",
            "",
            "\u0434\u043d\u044f",
            "",
            "\u0432\u0435\u0447\u0435\u0440\u0430",
            "",
            "\u043d\u043e\u0447\u0438",
            "",
        };
        final String[] metaValue_generic_narrow_AmPmMarkers = new String[] {
            "AM",
            "PM",
            "\u043f\u043e\u043b\u043d.",
            "\u043f\u043e\u043b\u0434.",
            "\u0443\u0442\u0440\u0430",
            "",
            "\u0434\u043d\u044f",
            "",
            "\u0432\u0435\u0447.",
            "",
            "\u043d\u043e\u0447\u0438",
            "",
        };
        final String[] metaValue_generic_abbreviated_AmPmMarkers = new String[] {
            "AM",
            "PM",
            "\u043f\u043e\u043b\u043d.",
            "\u043f\u043e\u043b\u0434.",
            "\u0443\u0442\u0440\u0430",
            "",
            "\u0434\u043d\u044f",
            "",
            "\u0432\u0435\u0447\u0435\u0440\u0430",
            "",
            "\u043d\u043e\u0447\u0438",
            "",
        };
        final String[] metaValue_java_time_long_Eras = new String[] {
            "\u0434\u043e \u0420\u043e\u0436\u0434\u0435\u0441\u0442\u0432\u0430 \u0425\u0440\u0438\u0441\u0442\u043e\u0432\u0430",
            "\u043e\u0442 \u0420\u043e\u0436\u0434\u0435\u0441\u0442\u0432\u0430 \u0425\u0440\u0438\u0441\u0442\u043e\u0432\u0430",
        };
        final String[] metaValue_java_time_Eras = new String[] {
            "\u0434\u043e \u043d. \u044d.",
            "\u043d. \u044d.",
        };
        final String[] metaValue_java_time_narrow_Eras = new String[] {
            "\u0434\u043e \u043d.\u044d.",
            "\u043d.\u044d.",
        };
        final String[] metaValue_generic_TimePatterns = new String[] {
            "HH:mm:ss zzzz",
            "HH:mm:ss z",
            "HH:mm:ss",
            "HH:mm",
        };
        final String[] metaValue_generic_DateTimePatterns = new String[] {
            "{1}, {0}",
            "{1}, {0}",
            "{1}, {0}",
            "{1}, {0}",
        };
        final String metaValue_generic_DateFormatItem_hm = "h:mm\u202fa";
        final String metaValue_generic_DateFormatItem_Ehm = "E h:mm\u202fa";
        final String metaValue_generic_DateFormatItem_hms = "h:mm:ss\u202fa";
        final String metaValue_generic_DateFormatItem_hmv = "h:mm\u202fa v";
        final String metaValue_generic_DateFormatItem_hmsv = "h:mm:ss\u202fa v";
        final String metaValue_generic_DateFormatItem_yw = "w-'\u044f' '\u043d\u0435\u0434\u0435\u043b\u044f' Y '\u0433'.";
        final String metaValue_generic_DateFormatItem_yQQQ = "QQQ y\u202f'\u0433'.";
        final String metaValue_generic_DateFormatItem_EBhm = "ccc, h:mm B";
        final String metaValue_generic_DateFormatItem_MMMMd = "d MMMM";
        final String metaValue_generic_DateFormatItem_MMMEd = "ccc, d MMM";
        final String metaValue_generic_DateFormatItem_h = "h\u202fa";
        final String metaValue_generic_DateFormatItem_GyMd = "dd.MM.y GGGGG";
        final String metaValue_generic_DateFormatItem_MMMd = "d MMM";
        final String metaValue_generic_DateFormatItem_MMMMW = "W-'\u044f' '\u043d\u0435\u0434\u0435\u043b\u044f' MMMM";
        final String metaValue_generic_DateFormatItem_yMMMEd = "E, d MMM y\u202f'\u0433'.";
        final String metaValue_generic_DateFormatItem_Ehms = "E h:mm:ss\u202fa";
        final String metaValue_generic_DateFormatItem_yMEd = "ccc, dd.MM.y\u202f'\u0433'.";
        final String metaValue_generic_DateFormatItem_yMMMd = "d MMM y\u202f'\u0433'.";
        final String metaValue_generic_DateFormatItem_yMMM = "LLL y\u202f'\u0433'.";
        final String metaValue_generic_DateFormatItem_EBhms = "ccc, h:mm:ss B";
        final String metaValue_generic_DateFormatItem_Ed = "ccc, d";
        final String metaValue_generic_DateFormatItem_MEd = "E, dd.MM";
        final String metaValue_generic_DateFormatItem_yMd = "dd.MM.y";
        final String metaValue_generic_DateFormatItem_yMMMM = "LLLL y\u202f'\u0433'.";
        final String metaValue_generic_DateFormatItem_yQQQQ = "QQQQ y\u202f'\u0433'.";
        final String[] metaValue_MonthNames = new String[] {
            "\u044f\u043d\u0432\u0430\u0440\u044f",
            "\u0444\u0435\u0432\u0440\u0430\u043b\u044f",
            "\u043c\u0430\u0440\u0442\u0430",
            "\u0430\u043f\u0440\u0435\u043b\u044f",
            "\u043c\u0430\u044f",
            "\u0438\u044e\u043d\u044f",
            "\u0438\u044e\u043b\u044f",
            "\u0430\u0432\u0433\u0443\u0441\u0442\u0430",
            "\u0441\u0435\u043d\u0442\u044f\u0431\u0440\u044f",
            "\u043e\u043a\u0442\u044f\u0431\u0440\u044f",
            "\u043d\u043e\u044f\u0431\u0440\u044f",
            "\u0434\u0435\u043a\u0430\u0431\u0440\u044f",
            "",
        };
        final String[] metaValue_MonthAbbreviations = new String[] {
            "\u044f\u043d\u0432.",
            "\u0444\u0435\u0432\u0440.",
            "\u043c\u0430\u0440.",
            "\u0430\u043f\u0440.",
            "\u043c\u0430\u044f",
            "\u0438\u044e\u043d.",
            "\u0438\u044e\u043b.",
            "\u0430\u0432\u0433.",
            "\u0441\u0435\u043d\u0442.",
            "\u043e\u043a\u0442.",
            "\u043d\u043e\u044f\u0431.",
            "\u0434\u0435\u043a.",
            "",
        };
        final String[] metaValue_java_time_buddhist_long_Eras = new String[] {
            "BC",
            "\u0431\u0443\u0434\u0434\u0438\u0439\u0441\u043a\u0430\u044f \u044d\u0440\u0430",
        };
        final String[] metaValue_java_time_buddhist_narrow_Eras = new String[] {
            "BC",
            "\u0431\u044d",
        };
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "EEEE, d MMMM y\u202f'\u0433'. G",
            "d MMMM y\u202f'\u0433'. G",
            "d MMM y\u202f'\u0433'. G",
            "dd.MM.y G",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "EEEE, d MMMM y\u202f'\u0433'. GGGG",
            "d MMMM y\u202f'\u0433'. GGGG",
            "d MMM y\u202f'\u0433'. GGGG",
            "dd.MM.y GGGG",
        };
        final String[] metaValue_java_time_japanese_long_Eras = new String[] {
            "\u043e\u0442 \u0420\u043e\u0436\u0434\u0435\u0441\u0442\u0432\u0430 \u0425\u0440\u0438\u0441\u0442\u043e\u0432\u0430",
            "\u042d\u043f\u043e\u0445\u0430 \u041c\u044d\u0439\u0434\u0437\u0438",
            "\u042d\u043f\u043e\u0445\u0430 \u0422\u0430\u0439\u0441\u044c\u043e",
            "\u0421\u044c\u043e\u0432\u0430",
            "\u042d\u043f\u043e\u0445\u0430 \u0425\u044d\u0439\u0441\u044d\u0439",
            "\u0420\u044d\u0439\u0432\u0430",
        };
        final String[] metaValue_java_time_japanese_Eras = new String[] {
            "\u043d. \u044d.",
            "\u042d\u043f\u043e\u0445\u0430 \u041c\u044d\u0439\u0434\u0437\u0438",
            "\u042d\u043f\u043e\u0445\u0430 \u0422\u0430\u0439\u0441\u044c\u043e",
            "\u0421\u044c\u043e\u0432\u0430",
            "\u042d\u043f\u043e\u0445\u0430 \u0425\u044d\u0439\u0441\u044d\u0439",
            "\u0420\u044d\u0439\u0432\u0430",
        };
        final String[] metaValue_java_time_roc_long_Eras = new String[] {
            "\u0434\u043e \u043e\u0441\u043d\u043e\u0432\u0430\u043d\u0438\u044f \u041a\u0438\u0442\u0430\u0439\u0441\u043a\u043e\u0439 \u0440\u0435\u0441\u043f\u0443\u0431\u043b\u0438\u043a\u0438",
            "\u041c\u0438\u043d\u044c\u0433\u043e",
        };
        final String[] metaValue_java_time_roc_Eras = new String[] {
            "Before R.O.C.",
            "Minguo",
        };
        final String[] metaValue_java_time_roc_narrow_Eras = new String[] {
            "\u0434\u043e \u0440\u0435\u0441\u043f.",
            "\u041c\u0438\u043d\u044c\u0433\u043e",
        };
        final String[] metaValue_java_time_islamic_long_Eras = new String[] {
            "",
            "\u043f\u043e\u0441\u043b\u0435 \u0445\u0438\u0434\u0436\u0440\u044b",
        };
        final String metaValue_calendarname_gregorian = "\u0433\u0440\u0438\u0433\u043e\u0440\u0438\u0430\u043d\u0441\u043a\u0438\u0439 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440\u044c";
        final String[] metaValue_ListPatterns_standard = new String[] {
            "",
            "",
            "{0} \u0438 {1}",
            "{0} \u0438 {1}",
            "",
        };
        final String[] metaValue_ListPatterns_or = new String[] {
            "",
            "",
            "{0} \u0438\u043b\u0438 {1}",
            "{0} \u0438\u043b\u0438 {1}",
            "",
        };
        final Object[][] data = new Object[][] {
            { "generic.DayNames", metaValue_generic_DayNames },
            { "generic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "generic.DayNarrows", metaValue_generic_DayNarrows },
            { "generic.QuarterNames", metaValue_generic_QuarterNames },
            { "generic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "generic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "generic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "generic.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "generic.DateTimePatterns", metaValue_generic_DateTimePatterns },
            { "generic.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "generic.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "generic.DateFormatItem.yyyyMMMM", "LLLL y\u202f'\u0433'. G" },
            { "generic.DateFormatItem.yyyyQQQQ", "QQQQ y\u202f'\u0433'. G" },
            { "generic.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "generic.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "generic.DateFormatItem.yyyyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "generic.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "generic.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "generic.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "generic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "generic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "generic.DateFormatItem.EHm", "ccc HH:mm" },
            { "generic.DateFormatItem.yyyyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "generic.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "generic.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "generic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "generic.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "generic.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "generic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "generic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "generic.DateFormatItem.yyyy", metaValue_generic_DateFormatItem_Gy },
            { "generic.DateFormatItem.y", metaValue_generic_DateFormatItem_Gy },
            { "generic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "generic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "generic.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "generic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "generic.DateFormatItem.yyyyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "generic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "generic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "generic.DateFormatItem.yyyyMEd", "E, dd.MM.y G" },
            { "generic.DateFormatItem.EHms", "ccc HH:mm:ss" },
            { "generic.DateFormatItem.yyyyMd", "dd.MM.y G" },
            { "generic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "generic.DateFormatItem.Md", metaValue_generic_DateFormatItem_MMdd },
            { "generic.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "generic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "generic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "generic.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "generic.DateFormatItem.yyyyQQQ", "QQQ y\u202f'\u0433'. G" },
            { "generic.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "generic.DateFormatItem.yyyyM", "MM.y G" },
            { "generic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "generic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yMM },
            { "generic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "generic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "MonthNames", metaValue_MonthNames },
            { "standalone.MonthNames",
                new String[] {
                    "\u044f\u043d\u0432\u0430\u0440\u044c",
                    "\u0444\u0435\u0432\u0440\u0430\u043b\u044c",
                    "\u043c\u0430\u0440\u0442",
                    "\u0430\u043f\u0440\u0435\u043b\u044c",
                    "\u043c\u0430\u0439",
                    "\u0438\u044e\u043d\u044c",
                    "\u0438\u044e\u043b\u044c",
                    "\u0430\u0432\u0433\u0443\u0441\u0442",
                    "\u0441\u0435\u043d\u0442\u044f\u0431\u0440\u044c",
                    "\u043e\u043a\u0442\u044f\u0431\u0440\u044c",
                    "\u043d\u043e\u044f\u0431\u0440\u044c",
                    "\u0434\u0435\u043a\u0430\u0431\u0440\u044c",
                    "",
                }
            },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "standalone.MonthAbbreviations",
                new String[] {
                    "\u044f\u043d\u0432.",
                    "\u0444\u0435\u0432\u0440.",
                    "\u043c\u0430\u0440\u0442",
                    "\u0430\u043f\u0440.",
                    "\u043c\u0430\u0439",
                    "\u0438\u044e\u043d\u044c",
                    "\u0438\u044e\u043b\u044c",
                    "\u0430\u0432\u0433.",
                    "\u0441\u0435\u043d\u0442.",
                    "\u043e\u043a\u0442.",
                    "\u043d\u043e\u044f\u0431.",
                    "\u0434\u0435\u043a.",
                    "",
                }
            },
            { "MonthNarrows", metaValue_MonthNarrows },
            { "standalone.MonthNarrows", metaValue_MonthNarrows },
            { "DayNames", metaValue_generic_DayNames },
            { "standalone.DayNames", metaValue_generic_DayNames },
            { "DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "standalone.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "DayNarrows", metaValue_generic_DayNarrows },
            { "standalone.DayNarrows", metaValue_generic_DayNarrows },
            { "QuarterNames", metaValue_generic_QuarterNames },
            { "standalone.QuarterNames", metaValue_generic_QuarterNames },
            { "QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "standalone.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "java.time.long.Eras", metaValue_java_time_long_Eras },
            { "long.Eras", metaValue_java_time_long_Eras },
            { "java.time.Eras", metaValue_java_time_Eras },
            { "Eras", metaValue_java_time_Eras },
            { "java.time.narrow.Eras", metaValue_java_time_narrow_Eras },
            { "narrow.Eras", metaValue_java_time_narrow_Eras },
            { "field.era", "\u044d\u0440\u0430" },
            { "field.year", "\u0433\u043e\u0434" },
            { "field.month", "\u043c\u0435\u0441\u044f\u0446" },
            { "field.week", "\u043d\u0435\u0434\u0435\u043b\u044f" },
            { "field.weekday", "\u0434\u0435\u043d\u044c \u043d\u0435\u0434\u0435\u043b\u0438" },
            { "field.dayperiod", "AM/PM" },
            { "field.hour", "\u0447\u0430\u0441" },
            { "timezone.regionFormat.daylight", "{0}, \u043b\u0435\u0442\u043d\u0435\u0435 \u0432\u0440\u0435\u043c\u044f" },
            { "timezone.regionFormat.standard", "{0}, \u0441\u0442\u0430\u043d\u0434\u0430\u0440\u0442\u043d\u043e\u0435 \u0432\u0440\u0435\u043c\u044f" },
            { "field.minute", "\u043c\u0438\u043d\u0443\u0442\u0430" },
            { "field.second", "\u0441\u0435\u043a\u0443\u043d\u0434\u0430" },
            { "field.zone", "\u0447\u0430\u0441\u043e\u0432\u043e\u0439 \u043f\u043e\u044f\u0441" },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "DatePatterns",
                new String[] {
                    "EEEE, d MMMM y\u202f'\u0433'.",
                    "d MMMM y\u202f'\u0433'.",
                    "d MMM y\u202f'\u0433'.",
                    "dd.MM.y",
                }
            },
            { "DateTimePatterns", metaValue_generic_DateTimePatterns },
            { "PluralRules", "one:v = 0 and i % 10 = 1 and i % 100 != 11;few:v = 0 and i % 10 = 2..4 and i % 100 != 12..14;many:v = 0 and i % 10 = 0 or v = 0 and i % 10 = 5..9 or v = 0 and i % 100 = 11..14" },
            { "DayPeriodRules", "midnight:00:00;noon:12:00;night1:22:00-04:00;afternoon1:12:00-18:00;morning1:04:00-12:00;evening1:18:00-22:00" },
            { "DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "DateFormatItem.Md", metaValue_generic_DateFormatItem_MMdd },
            { "DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "DateFormatItem.yM", metaValue_generic_DateFormatItem_yMM },
            { "DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "buddhist.DayNames", metaValue_generic_DayNames },
            { "buddhist.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "buddhist.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "buddhist.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "java.time.buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "java.time.buddhist.narrow.Eras", metaValue_java_time_buddhist_narrow_Eras },
            { "buddhist.narrow.Eras", metaValue_java_time_buddhist_narrow_Eras },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "buddhist.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "buddhist.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "buddhist.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "buddhist.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "buddhist.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "buddhist.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "buddhist.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "buddhist.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "buddhist.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "buddhist.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "buddhist.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "buddhist.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "buddhist.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "buddhist.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "buddhist.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "buddhist.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "buddhist.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "buddhist.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "buddhist.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "buddhist.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "buddhist.DateFormatItem.Md", metaValue_generic_DateFormatItem_MMdd },
            { "buddhist.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "buddhist.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "buddhist.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "buddhist.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "buddhist.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "buddhist.DateFormatItem.yM", metaValue_generic_DateFormatItem_yMM },
            { "buddhist.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "buddhist.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "japanese.DayNames", metaValue_generic_DayNames },
            { "japanese.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "japanese.QuarterNames", metaValue_generic_QuarterNames },
            { "japanese.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "japanese.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "japanese.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "japanese.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "java.time.japanese.long.Eras", metaValue_java_time_japanese_long_Eras },
            { "japanese.long.Eras", metaValue_java_time_japanese_long_Eras },
            { "java.time.japanese.Eras", metaValue_java_time_japanese_Eras },
            { "japanese.Eras", metaValue_java_time_japanese_Eras },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.japanese.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "japanese.DatePatterns", metaValue_generic_DatePatterns },
            { "japanese.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "japanese.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "japanese.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "japanese.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "japanese.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "japanese.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "japanese.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "japanese.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "japanese.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "japanese.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "japanese.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "japanese.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "japanese.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "japanese.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "japanese.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "japanese.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "japanese.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "japanese.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "japanese.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "japanese.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "japanese.DateFormatItem.Md", metaValue_generic_DateFormatItem_MMdd },
            { "japanese.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "japanese.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "japanese.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "japanese.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "japanese.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "japanese.DateFormatItem.yM", metaValue_generic_DateFormatItem_yMM },
            { "japanese.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "japanese.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "roc.MonthNames", metaValue_MonthNames },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "roc.DayNames", metaValue_generic_DayNames },
            { "roc.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "roc.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.QuarterNames", metaValue_generic_QuarterNames },
            { "roc.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "roc.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "roc.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "java.time.roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "java.time.roc.Eras", metaValue_java_time_roc_Eras },
            { "roc.Eras", metaValue_java_time_roc_Eras },
            { "java.time.roc.narrow.Eras", metaValue_java_time_roc_narrow_Eras },
            { "roc.narrow.Eras", metaValue_java_time_roc_narrow_Eras },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.roc.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "roc.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "roc.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "roc.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "roc.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "roc.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "roc.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "roc.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "roc.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "roc.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "roc.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "roc.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "roc.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "roc.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "roc.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "roc.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "roc.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "roc.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "roc.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "roc.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "roc.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "roc.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "roc.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "roc.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "roc.DateFormatItem.Md", metaValue_generic_DateFormatItem_MMdd },
            { "roc.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "roc.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "roc.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "roc.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "roc.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "roc.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "roc.DateFormatItem.yM", metaValue_generic_DateFormatItem_yMM },
            { "roc.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "roc.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "islamic.MonthNames",
                new String[] {
                    "\u043c\u0443\u0445\u0430\u0440\u0440\u0430\u043c",
                    "\u0441\u0430\u0444\u0430\u0440",
                    "\u0440\u0430\u0431\u0438-\u0443\u043b\u044c-\u0430\u0432\u0432\u0430\u043b\u044c",
                    "\u0440\u0430\u0431\u0438-\u0443\u043b\u044c-\u0430\u0445\u0438\u0440",
                    "\u0434\u0436\u0443\u043c\u0430\u0434-\u0443\u043b\u044c-\u0430\u0432\u0432\u0430\u043b\u044c",
                    "\u0434\u0436\u0443\u043c\u0430\u0434-\u0443\u043b\u044c-\u0430\u0445\u0438\u0440",
                    "\u0440\u0430\u0434\u0436\u0430\u0431",
                    "\u0448\u0430\u0430\u0431\u0430\u043d",
                    "\u0440\u0430\u043c\u0430\u0434\u0430\u043d",
                    "\u0448\u0430\u0432\u0432\u0430\u043b\u044c",
                    "\u0437\u0443\u043b\u044c-\u043a\u0430\u0430\u0434\u0430",
                    "\u0437\u0443\u043b\u044c-\u0445\u0438\u0434\u0436\u0436\u0430",
                    "",
                }
            },
            { "islamic.MonthAbbreviations",
                new String[] {
                    "\u043c\u0443\u0445.",
                    "\u0441\u0430\u0444.",
                    "\u0440\u0430\u0431. I",
                    "\u0440\u0430\u0431. II",
                    "\u0434\u0436\u0443\u043c. I",
                    "\u0434\u0436\u0443\u043c. II",
                    "\u0440\u0430\u0434\u0436.",
                    "\u0448\u0430\u0430\u0431.",
                    "\u0440\u0430\u043c.",
                    "\u0448\u0430\u0432.",
                    "\u0437\u0443\u043b\u044c-\u043a.",
                    "\u0437\u0443\u043b\u044c-\u0445.",
                    "",
                }
            },
            { "islamic.DayNames", metaValue_generic_DayNames },
            { "islamic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "java.time.islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.islamic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "islamic.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "islamic.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "islamic.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "islamic.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "islamic.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "islamic.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "islamic.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "islamic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "islamic.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "islamic.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic.DateFormatItem.Md", metaValue_generic_DateFormatItem_MMdd },
            { "islamic.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "islamic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "islamic.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yMM },
            { "islamic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "islamic-civil.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "islamic-civil.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "islamic-civil.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "islamic-civil.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "islamic-civil.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "islamic-civil.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "islamic-civil.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "islamic-civil.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-civil.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-civil.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "islamic-civil.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic-civil.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-civil.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "islamic-civil.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic-civil.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic-civil.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic-civil.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-civil.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "islamic-civil.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-civil.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic-civil.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-civil.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-civil.DateFormatItem.Md", metaValue_generic_DateFormatItem_MMdd },
            { "islamic-civil.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "islamic-civil.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic-civil.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-civil.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "islamic-civil.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic-civil.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-civil.DateFormatItem.yM", metaValue_generic_DateFormatItem_yMM },
            { "islamic-civil.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic-civil.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "islamic-umalqura.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "islamic-umalqura.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "islamic-umalqura.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "islamic-umalqura.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "islamic-umalqura.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "islamic-umalqura.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "islamic-umalqura.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "islamic-umalqura.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-umalqura.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-umalqura.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "islamic-umalqura.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic-umalqura.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-umalqura.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "islamic-umalqura.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic-umalqura.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-umalqura.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic-umalqura.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic-umalqura.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-umalqura.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "islamic-umalqura.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-umalqura.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic-umalqura.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-umalqura.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-umalqura.DateFormatItem.Md", metaValue_generic_DateFormatItem_MMdd },
            { "islamic-umalqura.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "islamic-umalqura.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic-umalqura.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-umalqura.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "islamic-umalqura.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic-umalqura.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-umalqura.DateFormatItem.yM", metaValue_generic_DateFormatItem_yMM },
            { "islamic-umalqura.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic-umalqura.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "calendarname.islamic-civil", "\u0433\u0440\u0430\u0436\u0434\u0430\u043d\u0441\u043a\u0438\u0439 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440\u044c \u0445\u0438\u0434\u0436\u0440\u044b (\u0442\u0430\u0431\u043b\u0438\u0447\u043d\u044b\u0439)" },
            { "calendarname.islamic", "\u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440\u044c \u0445\u0438\u0434\u0436\u0440\u044b" },
            { "calendarname.buddhist", "\u0431\u0443\u0434\u0434\u0438\u0439\u0441\u043a\u0438\u0439 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440\u044c" },
            { "calendarname.japanese", "\u044f\u043f\u043e\u043d\u0441\u043a\u0438\u0439 \u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440\u044c" },
            { "calendarname.roc", "\u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440\u044c \u041c\u0438\u043d\u044c\u0433\u043e" },
            { "calendarname.islamic-umalqura", "\u043a\u0430\u043b\u0435\u043d\u0434\u0430\u0440\u044c \u0445\u0438\u0434\u0436\u0440\u044b (\u0423\u043c\u043c \u0430\u043b\u044c-\u041a\u0443\u0440\u0430)" },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
            { "latn.NumberElements",
                new String[] {
                    ",",
                    "\u00a0",
                    ";",
                    "%",
                    "0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u043d\u0435\u00a0\u0447\u0438\u0441\u043b\u043e",
                    "",
                    "",
                }
            },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "#,##0.00\u00a0\u00a4",
                    "#,##0\u00a0%",
                    "",
                }
            },
            { "short.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0\u00a0\u0442\u044b\u0441'.' other:0\u00a0\u0442\u044b\u0441'.'}",
                    "{one:00\u00a0\u0442\u044b\u0441'.' other:00\u00a0\u0442\u044b\u0441'.'}",
                    "{one:000\u00a0\u0442\u044b\u0441'.' other:000\u00a0\u0442\u044b\u0441'.'}",
                    "{one:0\u00a0\u043c\u043b\u043d other:0\u00a0\u043c\u043b\u043d}",
                    "{one:00\u00a0\u043c\u043b\u043d other:00\u00a0\u043c\u043b\u043d}",
                    "{one:000\u00a0\u043c\u043b\u043d other:000\u00a0\u043c\u043b\u043d}",
                    "{one:0\u00a0\u043c\u043b\u0440\u0434 other:0\u00a0\u043c\u043b\u0440\u0434}",
                    "{one:00\u00a0\u043c\u043b\u0440\u0434 other:00\u00a0\u043c\u043b\u0440\u0434}",
                    "{one:000\u00a0\u043c\u043b\u0440\u0434 other:000\u00a0\u043c\u043b\u0440\u0434}",
                    "{one:0\u00a0\u0442\u0440\u043b\u043d other:0\u00a0\u0442\u0440\u043b\u043d}",
                    "{one:00\u00a0\u0442\u0440\u043b\u043d other:00\u00a0\u0442\u0440\u043b\u043d}",
                    "{one:000\u00a0\u0442\u0440\u043b\u043d other:000\u00a0\u0442\u0440\u043b\u043d}",
                }
            },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0' '\u0442\u044b\u0441\u044f\u0447\u0430 few:0' '\u0442\u044b\u0441\u044f\u0447\u0438 many:0' '\u0442\u044b\u0441\u044f\u0447 other:0' '\u0442\u044b\u0441\u044f\u0447\u0438}",
                    "{one:00' '\u0442\u044b\u0441\u044f\u0447\u0430 few:00' '\u0442\u044b\u0441\u044f\u0447\u0438 many:00' '\u0442\u044b\u0441\u044f\u0447 other:00' '\u0442\u044b\u0441\u044f\u0447\u0438}",
                    "{one:000' '\u0442\u044b\u0441\u044f\u0447\u0430 few:000' '\u0442\u044b\u0441\u044f\u0447\u0438 many:000' '\u0442\u044b\u0441\u044f\u0447 other:000' '\u0442\u044b\u0441\u044f\u0447\u0438}",
                    "{one:0' '\u043c\u0438\u043b\u043b\u0438\u043e\u043d few:0' '\u043c\u0438\u043b\u043b\u0438\u043e\u043d\u0430 many:0' '\u043c\u0438\u043b\u043b\u0438\u043e\u043d\u043e\u0432 other:0' '\u043c\u0438\u043b\u043b\u0438\u043e\u043d\u0430}",
                    "{one:00' '\u043c\u0438\u043b\u043b\u0438\u043e\u043d few:00' '\u043c\u0438\u043b\u043b\u0438\u043e\u043d\u0430 many:00' '\u043c\u0438\u043b\u043b\u0438\u043e\u043d\u043e\u0432 other:00' '\u043c\u0438\u043b\u043b\u0438\u043e\u043d\u0430}",
                    "{one:000' '\u043c\u0438\u043b\u043b\u0438\u043e\u043d few:000' '\u043c\u0438\u043b\u043b\u0438\u043e\u043d\u0430 many:000' '\u043c\u0438\u043b\u043b\u0438\u043e\u043d\u043e\u0432 other:000' '\u043c\u0438\u043b\u043b\u0438\u043e\u043d\u0430}",
                    "{one:0' '\u043c\u0438\u043b\u043b\u0438\u0430\u0440\u0434 few:0' '\u043c\u0438\u043b\u043b\u0438\u0430\u0440\u0434\u0430 many:0' '\u043c\u0438\u043b\u043b\u0438\u0430\u0440\u0434\u043e\u0432 other:0' '\u043c\u0438\u043b\u043b\u0438\u0430\u0440\u0434\u0430}",
                    "{one:00' '\u043c\u0438\u043b\u043b\u0438\u0430\u0440\u0434 few:00' '\u043c\u0438\u043b\u043b\u0438\u0430\u0440\u0434\u0430 many:00' '\u043c\u0438\u043b\u043b\u0438\u0430\u0440\u0434\u043e\u0432 other:00' '\u043c\u0438\u043b\u043b\u0438\u0430\u0440\u0434\u0430}",
                    "{one:000' '\u043c\u0438\u043b\u043b\u0438\u0430\u0440\u0434 few:000' '\u043c\u0438\u043b\u043b\u0438\u0430\u0440\u0434\u0430 many:000' '\u043c\u0438\u043b\u043b\u0438\u0430\u0440\u0434\u043e\u0432 other:000' '\u043c\u0438\u043b\u043b\u0438\u0430\u0440\u0434\u0430}",
                    "{one:0' '\u0442\u0440\u0438\u043b\u043b\u0438\u043e\u043d few:0' '\u0442\u0440\u0438\u043b\u043b\u0438\u043e\u043d\u0430 many:0' '\u0442\u0440\u0438\u043b\u043b\u0438\u043e\u043d\u043e\u0432 other:0' '\u0442\u0440\u0438\u043b\u043b\u0438\u043e\u043d\u0430}",
                    "{one:00' '\u0442\u0440\u0438\u043b\u043b\u0438\u043e\u043d few:00' '\u0442\u0440\u0438\u043b\u043b\u0438\u043e\u043d\u0430 many:00' '\u0442\u0440\u0438\u043b\u043b\u0438\u043e\u043d\u043e\u0432 other:00' '\u0442\u0440\u0438\u043b\u043b\u0438\u043e\u043d\u0430}",
                    "{one:000' '\u0442\u0440\u0438\u043b\u043b\u0438\u043e\u043d few:000' '\u0442\u0440\u0438\u043b\u043b\u0438\u043e\u043d\u0430 many:000' '\u0442\u0440\u0438\u043b\u043b\u0438\u043e\u043d\u043e\u0432 other:000' '\u0442\u0440\u0438\u043b\u043b\u0438\u043e\u043d\u0430}",
                }
            },
            { "ListPatterns_standard", metaValue_ListPatterns_standard },
            { "ListPatterns_standard-short", metaValue_ListPatterns_standard },
            { "ListPatterns_standard-narrow",
                new String[] {
                    "",
                    "",
                    "{0}, {1}",
                    "{0}, {1}",
                    "",
                }
            },
            { "ListPatterns_or", metaValue_ListPatterns_or },
            { "ListPatterns_or-short", metaValue_ListPatterns_or },
            { "ListPatterns_or-narrow", metaValue_ListPatterns_or },
            { "ListPatterns_unit", metaValue_ListPatterns_standard },
            { "ListPatterns_unit-short",
                new String[] {
                    "{0} {1}",
                    "{0} {1}",
                    "{0} {1}",
                    "{0} {1}",
                    "",
                }
            },
            { "ListPatterns_unit-narrow", metaValue_ListPatterns_standard },
        };
        return data;
    }
}
