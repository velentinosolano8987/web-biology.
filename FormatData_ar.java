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

public class FormatData_ar extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_DayNames = new String[] {
            "\u0627\u0644\u0623\u062d\u062f",
            "\u0627\u0644\u0627\u062b\u0646\u064a\u0646",
            "\u0627\u0644\u062b\u0644\u0627\u062b\u0627\u0621",
            "\u0627\u0644\u0623\u0631\u0628\u0639\u0627\u0621",
            "\u0627\u0644\u062e\u0645\u064a\u0633",
            "\u0627\u0644\u062c\u0645\u0639\u0629",
            "\u0627\u0644\u0633\u0628\u062a",
        };
        final String metaValue_generic_DateFormatItem_yyyyMMMd = "d MMM y G";
        final String metaValue_generic_DateFormatItem_yyyyMMMEd = "E\u060c d MMM y G";
        final String metaValue_generic_DateFormatItem_Gy = "y G";
        final String metaValue_generic_DateFormatItem_yyyyMMM = "MMM y G";
        final String[] metaValue_MonthNames = new String[] {
            "\u064a\u0646\u0627\u064a\u0631",
            "\u0641\u0628\u0631\u0627\u064a\u0631",
            "\u0645\u0627\u0631\u0633",
            "\u0623\u0628\u0631\u064a\u0644",
            "\u0645\u0627\u064a\u0648",
            "\u064a\u0648\u0646\u064a\u0648",
            "\u064a\u0648\u0644\u064a\u0648",
            "\u0623\u063a\u0633\u0637\u0633",
            "\u0633\u0628\u062a\u0645\u0628\u0631",
            "\u0623\u0643\u062a\u0648\u0628\u0631",
            "\u0646\u0648\u0641\u0645\u0628\u0631",
            "\u062f\u064a\u0633\u0645\u0628\u0631",
            "",
        };
        final String[] metaValue_MonthNarrows = new String[] {
            "\u064a",
            "\u0641",
            "\u0645",
            "\u0623",
            "\u0648",
            "\u0646",
            "\u0644",
            "\u063a",
            "\u0633",
            "\u0643",
            "\u0628",
            "\u062f",
            "",
        };
        final String[] metaValue_generic_DayNarrows = new String[] {
            "\u062d",
            "\u0646",
            "\u062b",
            "\u0631",
            "\u062e",
            "\u062c",
            "\u0633",
        };
        final String[] metaValue_generic_QuarterNames = new String[] {
            "\u0627\u0644\u0631\u0628\u0639 \u0627\u0644\u0623\u0648\u0644",
            "\u0627\u0644\u0631\u0628\u0639 \u0627\u0644\u062b\u0627\u0646\u064a",
            "\u0627\u0644\u0631\u0628\u0639 \u0627\u0644\u062b\u0627\u0644\u062b",
            "\u0627\u0644\u0631\u0628\u0639 \u0627\u0644\u0631\u0627\u0628\u0639",
        };
        final String[] metaValue_QuarterNarrows = new String[] {
            "\u0661",
            "\u0662",
            "\u0663",
            "\u0664",
        };
        final String[] metaValue_generic_AmPmMarkers = new String[] {
            "\u0635",
            "\u0645",
            "",
            "",
            "\u0641\u064a \u0627\u0644\u0635\u0628\u0627\u062d",
            "\u0635\u0628\u0627\u062d\u064b\u0627",
            "\u0638\u0647\u0631\u064b\u0627",
            "\u0628\u0639\u062f \u0627\u0644\u0638\u0647\u0631",
            "\u0645\u0633\u0627\u0621\u064b",
            "",
            "\u0641\u064a \u0627\u0644\u0645\u0633\u0627\u0621",
            "\u0644\u064a\u0644\u0627\u064b",
        };
        final String[] metaValue_generic_narrow_AmPmMarkers = new String[] {
            "\u0635",
            "\u0645",
            "",
            "",
            "\u0641\u062c\u0631\u064b\u0627",
            "\u0635\u0628\u0627\u062d\u064b\u0627",
            "\u0638\u0647\u0631\u064b\u0627",
            "\u0628\u0639\u062f \u0627\u0644\u0638\u0647\u0631",
            "\u0645\u0633\u0627\u0621\u064b",
            "",
            "\u0645\u0646\u062a\u0635\u0641 \u0627\u0644\u0644\u064a\u0644",
            "\u0644\u064a\u0644\u0627\u064b",
        };
        final String[] metaValue_generic_abbreviated_AmPmMarkers = new String[] {
            "\u0635",
            "\u0645",
            "",
            "",
            "\u0641\u062c\u0631\u064b\u0627",
            "\u0635",
            "\u0638\u0647\u0631\u064b\u0627",
            "\u0628\u0639\u062f \u0627\u0644\u0638\u0647\u0631",
            "\u0645\u0633\u0627\u0621\u064b",
            "",
            "\u0641\u064a \u0627\u0644\u0645\u0633\u0627\u0621",
            "\u0644\u064a\u0644\u0627\u064b",
        };
        final String[] metaValue_java_time_long_Eras = new String[] {
            "\u0642\u0628\u0644 \u0627\u0644\u0645\u064a\u0644\u0627\u062f",
            "\u0645\u064a\u0644\u0627\u062f\u064a",
        };
        final String[] metaValue_java_time_Eras = new String[] {
            "\u0642.\u0645",
            "\u0645",
        };
        final String[] metaValue_generic_TimePatterns = new String[] {
            "h:mm:ss a zzzz",
            "h:mm:ss a z",
            "h:mm:ss a",
            "h:mm a",
        };
        final String metaValue_generic_DateFormatItem_MMdd = "dd\u200f/MM";
        final String metaValue_generic_DateFormatItem_yMMMEd = "E\u060c d MMM y";
        final String metaValue_generic_DateFormatItem_yMEd = "E\u060c d\u200f/M\u200f/y";
        final String metaValue_generic_DateFormatItem_yMMMd = "d MMM y";
        final String metaValue_generic_DateFormatItem_yw = "\u0627\u0644\u0623\u0633\u0628\u0648\u0639 w \u0645\u0646 \u0633\u0646\u0629 Y";
        final String metaValue_generic_DateFormatItem_yQQQ = "QQQ y";
        final String metaValue_generic_DateFormatItem_yMMM = "MMM y";
        final String metaValue_generic_DateFormatItem_Md = "d\u200f/M";
        final String metaValue_generic_DateFormatItem_MMMMEd = "E\u060c d MMMM";
        final String metaValue_generic_DateFormatItem_Ed = "E\u060c d";
        final String metaValue_generic_DateFormatItem_MMMMd = "d MMMM";
        final String metaValue_generic_DateFormatItem_MEd = "E\u060c d\u200f/M";
        final String metaValue_generic_DateFormatItem_MMMEd = "E\u060c d MMM";
        final String metaValue_generic_DateFormatItem_yMM = "MM\u200f/y";
        final String metaValue_generic_DateFormatItem_GyMd = "dd-MM-y GGGGG";
        final String metaValue_generic_DateFormatItem_yMd = "d\u200f/M\u200f/y";
        final String metaValue_generic_DateFormatItem_MMMd = "d MMM";
        final String metaValue_generic_DateFormatItem_yM = "M\u200f/y";
        final String metaValue_generic_DateFormatItem_yMMMM = "MMMM y";
        final String metaValue_generic_DateFormatItem_MMMMW = "\u0627\u0644\u0623\u0633\u0628\u0648\u0639 W \u0645\u0646 MMMM";
        final String metaValue_generic_DateFormatItem_yQQQQ = "QQQQ y";
        final String[] metaValue_java_time_buddhist_long_Eras = new String[] {
            "BC",
            "\u0627\u0644\u062a\u0642\u0648\u064a\u0645 \u0627\u0644\u0628\u0648\u0630\u064a",
        };
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "EEEE\u060c d MMMM y G",
            "d MMMM y G",
            "dd\u200f/MM\u200f/y G",
            "d\u200f/M\u200f/y GGGGG",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "EEEE\u060c d MMMM y GGGG",
            "d MMMM y GGGG",
            "dd\u200f/MM\u200f/y GGGG",
            "d\u200f/M\u200f/y G",
        };
        final String[] metaValue_java_time_japanese_long_Eras = new String[] {
            "\u0645\u064a\u0644\u0627\u062f\u064a",
            "\u0645\u064a\u062c\u064a",
            "\u062a\u064a\u0634\u0648",
            "\u0634\u0648\u0648\u0627",
            "\u0647\u064a\u0633\u064a",
            "\u0631\u064a\u0648\u0627",
        };
        final String[] metaValue_java_time_japanese_Eras = new String[] {
            "\u0645",
            "\u0645\u064a\u062c\u064a",
            "\u062a\u064a\u0634\u0648",
            "\u0634\u0648\u0648\u0627",
            "\u0647\u064a\u0633\u064a",
            "\u0631\u064a\u0648\u0627",
        };
        final String[] metaValue_java_time_roc_long_Eras = new String[] {
            "Before R.O.C.",
            "\u062c\u0645\u0647\u0648\u0631\u064a\u0629 \u0627\u0644\u0635\u064a",
        };
        final String[] metaValue_islamic_MonthNames = new String[] {
            "\u0645\u062d\u0631\u0645",
            "\u0635\u0641\u0631",
            "\u0631\u0628\u064a\u0639 \u0627\u0644\u0623\u0648\u0644",
            "\u0631\u0628\u064a\u0639 \u0627\u0644\u0622\u062e\u0631",
            "\u062c\u0645\u0627\u062f\u0649 \u0627\u0644\u0623\u0648\u0644\u0649",
            "\u062c\u0645\u0627\u062f\u0649 \u0627\u0644\u0622\u062e\u0631\u0629",
            "\u0631\u062c\u0628",
            "\u0634\u0639\u0628\u0627\u0646",
            "\u0631\u0645\u0636\u0627\u0646",
            "\u0634\u0648\u0627\u0644",
            "\u0630\u0648 \u0627\u0644\u0642\u0639\u062f\u0629",
            "\u0630\u0648 \u0627\u0644\u062d\u062c\u0629",
            "",
        };
        final String[] metaValue_java_time_islamic_long_Eras = new String[] {
            "",
            "\u0647\u0640",
        };
        final String metaValue_calendarname_gregorian = "\u0627\u0644\u062a\u0642\u0648\u064a\u0645 \u0627\u0644\u0645\u064a\u0644\u0627\u062f\u064a";
        final String[] metaValue_ListPatterns_standard = new String[] {
            "{0} \u0648{1}",
            "{0} \u0648{1}",
            "{0} \u0648{1}",
            "{0} \u0648{1}",
            "",
        };
        final String[] metaValue_ListPatterns_or = new String[] {
            "{0} \u0623\u0648 {1}",
            "{0} \u0623\u0648 {1}",
            "{0} \u0623\u0648 {1}",
            "{0} \u0623\u0648 {1}",
            "",
        };
        final Object[][] data = new Object[][] {
            { "generic.DayNames", metaValue_generic_DayNames },
            { "generic.DayAbbreviations", metaValue_generic_DayNames },
            { "generic.DayNarrows", metaValue_generic_DayNarrows },
            { "generic.QuarterNames", metaValue_generic_QuarterNames },
            { "generic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "generic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "generic.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "generic.DateTimePatterns",
                new String[] {
                    "{1}\u060c {0}",
                    "{1}\u060c {0}",
                    "{1}\u060c {0}",
                    "{1}, {0}",
                }
            },
            { "generic.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "generic.DateFormatItem.yyyyMMMM", "MMMM y G" },
            { "generic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "generic.DateFormatItem.yyyyQQQQ", "QQQQ y G" },
            { "generic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "generic.DateFormatItem.yyyyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "generic.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "generic.DateFormatItem.yyyyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "generic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "generic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "generic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "generic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "generic.DateFormatItem.yyyyMEd", "E\u060c d\u200f/M\u200f/y G" },
            { "generic.DateFormatItem.yyyyMd", "d\u200f/M\u200f/y G" },
            { "generic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "generic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "generic.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "generic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "generic.DateFormatItem.yyyyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "generic.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "generic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "generic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "generic.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "generic.DateFormatItem.yyyyQQQ", "QQQ y G" },
            { "generic.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "generic.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "generic.DateFormatItem.yyyyM", "M\u200f/y G" },
            { "generic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "generic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "generic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "generic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "generic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "generic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "generic.DateFormatItem.yyyy", metaValue_generic_DateFormatItem_Gy },
            { "generic.DateFormatItem.y", metaValue_generic_DateFormatItem_Gy },
            { "generic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "MonthNames", metaValue_MonthNames },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "MonthAbbreviations", metaValue_MonthNames },
            { "standalone.MonthAbbreviations", metaValue_MonthNames },
            { "MonthNarrows", metaValue_MonthNarrows },
            { "standalone.MonthNarrows", metaValue_MonthNarrows },
            { "DayNames", metaValue_generic_DayNames },
            { "standalone.DayNames", metaValue_generic_DayNames },
            { "DayAbbreviations", metaValue_generic_DayNames },
            { "standalone.DayAbbreviations", metaValue_generic_DayNames },
            { "DayNarrows", metaValue_generic_DayNarrows },
            { "standalone.DayNarrows", metaValue_generic_DayNarrows },
            { "QuarterNames", metaValue_generic_QuarterNames },
            { "standalone.QuarterNames", metaValue_generic_QuarterNames },
            { "QuarterAbbreviations", metaValue_generic_QuarterNames },
            { "QuarterNarrows", metaValue_QuarterNarrows },
            { "standalone.QuarterNarrows", metaValue_QuarterNarrows },
            { "AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "java.time.long.Eras", metaValue_java_time_long_Eras },
            { "long.Eras", metaValue_java_time_long_Eras },
            { "java.time.Eras", metaValue_java_time_Eras },
            { "Eras", metaValue_java_time_Eras },
            { "java.time.narrow.Eras", metaValue_java_time_Eras },
            { "narrow.Eras", metaValue_java_time_Eras },
            { "field.era", "\u0627\u0644\u0639\u0635\u0631" },
            { "field.year", "\u0627\u0644\u0633\u0646\u0629" },
            { "field.month", "\u0627\u0644\u0634\u0647\u0631" },
            { "field.week", "\u0627\u0644\u0623\u0633\u0628\u0648\u0639" },
            { "field.weekday", "\u0627\u0644\u064a\u0648\u0645" },
            { "field.dayperiod", "\u0635/\u0645" },
            { "field.hour", "\u0627\u0644\u0633\u0627\u0639\u0627\u062a" },
            { "timezone.gmtFormat", "\u063a\u0631\u064a\u0646\u062a\u0634{0}" },
            { "timezone.gmtZeroFormat", "\u063a\u0631\u064a\u0646\u062a\u0634" },
            { "timezone.regionFormat", "\u062a\u0648\u0642\u064a\u062a {0}" },
            { "timezone.regionFormat.daylight", "\u062a\u0648\u0642\u064a\u062a {0} \u0627\u0644\u0635\u064a\u0641\u064a" },
            { "timezone.regionFormat.standard", "\u062a\u0648\u0642\u064a\u062a {0} \u0627\u0644\u0631\u0633\u0645\u064a" },
            { "field.minute", "\u0627\u0644\u062f\u0642\u0627\u0626\u0642" },
            { "field.second", "\u0627\u0644\u062b\u0648\u0627\u0646\u064a" },
            { "field.zone", "\u0627\u0644\u062a\u0648\u0642\u064a\u062a" },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "DatePatterns",
                new String[] {
                    "EEEE\u060c d MMMM y",
                    "d MMMM y",
                    "dd\u200f/MM\u200f/y",
                    "d\u200f/M\u200f/y",
                }
            },
            { "DateTimePatterns",
                new String[] {
                    "{1}\u060c {0}",
                    "{1}\u060c {0}",
                    "{1}\u060c {0}",
                    "{1}\u060c {0}",
                }
            },
            { "PluralRules", "zero:n = 0;one:n = 1;few:n % 100 = 3..10;many:n % 100 = 11..99;two:n = 2" },
            { "DayPeriodRules", "night1:00:00-01:00;morning2:06:00-12:00;afternoon1:12:00-13:00;morning1:03:00-06:00;afternoon2:13:00-18:00;evening1:18:00-24:00;night2:01:00-03:00" },
            { "DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "buddhist.DayNames", metaValue_generic_DayNames },
            { "buddhist.DayAbbreviations", metaValue_generic_DayNames },
            { "buddhist.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "java.time.buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "buddhist.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "buddhist.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "buddhist.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "buddhist.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "buddhist.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "buddhist.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "buddhist.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "buddhist.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "buddhist.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "buddhist.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "buddhist.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "buddhist.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "buddhist.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "buddhist.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "buddhist.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "buddhist.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "buddhist.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "buddhist.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "buddhist.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "buddhist.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "buddhist.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "japanese.MonthAbbreviations", metaValue_MonthNames },
            { "japanese.DayNames", metaValue_generic_DayNames },
            { "japanese.DayAbbreviations", metaValue_generic_DayNames },
            { "japanese.QuarterNames", metaValue_generic_QuarterNames },
            { "japanese.QuarterNarrows", metaValue_QuarterNarrows },
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
            { "japanese.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "japanese.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "japanese.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "japanese.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "japanese.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "japanese.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "japanese.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "japanese.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "japanese.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "japanese.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "japanese.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "japanese.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "japanese.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "japanese.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "japanese.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "japanese.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "japanese.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "japanese.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "japanese.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "japanese.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "roc.MonthNames", metaValue_MonthNames },
            { "roc.MonthAbbreviations", metaValue_MonthNames },
            { "roc.DayNames", metaValue_generic_DayNames },
            { "roc.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.QuarterNames", metaValue_generic_QuarterNames },
            { "roc.QuarterNarrows", metaValue_QuarterNarrows },
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
            { "java.time.roc.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "roc.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "roc.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "roc.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "roc.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "roc.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "roc.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "roc.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "roc.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "roc.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "roc.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "roc.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "roc.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "roc.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "roc.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "roc.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "roc.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "roc.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "roc.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "roc.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "roc.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "roc.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "roc.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "roc.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "roc.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "roc.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic.MonthNames", metaValue_islamic_MonthNames },
            { "islamic.MonthAbbreviations", metaValue_islamic_MonthNames },
            { "islamic.MonthNarrows",
                new String[] {
                    "\u0661",
                    "\u0662",
                    "\u0663",
                    "\u0664",
                    "\u0665",
                    "\u0666",
                    "\u0667",
                    "\u0668",
                    "\u0669",
                    "\u0661\u0660",
                    "\u0661\u0661",
                    "\u0661\u0662",
                    "",
                }
            },
            { "islamic.DayNames", metaValue_generic_DayNames },
            { "islamic.DayAbbreviations", metaValue_generic_DayNames },
            { "islamic.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "java.time.islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "java.time.islamic.Eras", metaValue_java_time_islamic_long_Eras },
            { "islamic.Eras", metaValue_java_time_islamic_long_Eras },
            { "java.time.islamic.narrow.Eras", metaValue_java_time_islamic_long_Eras },
            { "islamic.narrow.Eras", metaValue_java_time_islamic_long_Eras },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.islamic.DatePatterns",
                new String[] {
                    "EEEE\u060c d MMMM y G",
                    "d MMMM y G",
                    "d MMM y G",
                    "d\u200f/M\u200f/y GGGGG",
                }
            },
            { "islamic.DatePatterns",
                new String[] {
                    "EEEE\u060c d MMMM y GGGG",
                    "d MMMM y GGGG",
                    "d MMM y GGGG",
                    "d\u200f/M\u200f/y G",
                }
            },
            { "islamic.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "islamic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "islamic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "islamic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "islamic.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "islamic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic-civil.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "islamic-civil.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-civil.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-civil.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "islamic-civil.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic-civil.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-civil.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-civil.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-civil.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-civil.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-civil.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "islamic-civil.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic-civil.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic-civil.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-civil.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-civil.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "islamic-civil.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic-civil.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic-civil.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-civil.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic-civil.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic-civil.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic-civil.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "islamic-civil.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic-umalqura.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "islamic-umalqura.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-umalqura.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-umalqura.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "islamic-umalqura.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic-umalqura.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-umalqura.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-umalqura.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-umalqura.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-umalqura.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "islamic-umalqura.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic-umalqura.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic-umalqura.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-umalqura.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-umalqura.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "islamic-umalqura.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic-umalqura.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic-umalqura.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-umalqura.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-umalqura.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic-umalqura.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic-umalqura.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic-umalqura.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "islamic-umalqura.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "calendarname.islamic-civil", "\u0627\u0644\u062a\u0642\u0648\u064a\u0645 \u0627\u0644\u0647\u062c\u0631\u064a \u0627\u0644\u0645\u062f\u0646\u064a" },
            { "calendarname.islamic", "\u0627\u0644\u062a\u0642\u0648\u064a\u0645 \u0627\u0644\u0647\u062c\u0631\u064a" },
            { "calendarname.buddhist", "\u0627\u0644\u062a\u0642\u0648\u064a\u0645 \u0627\u0644\u0628\u0648\u0630\u064a" },
            { "calendarname.japanese", "\u0627\u0644\u062a\u0642\u0648\u064a\u0645 \u0627\u0644\u064a\u0627\u0628\u0627\u0646\u064a" },
            { "calendarname.roc", "\u062a\u0642\u0648\u064a\u0645 \u0645\u064a\u0646\u062c\u0648" },
            { "calendarname.islamic-umalqura", "\u0627\u0644\u062a\u0642\u0648\u064a\u0645 \u0627\u0644\u0647\u062c\u0631\u064a (\u0623\u0645 \u0627\u0644\u0642\u0631\u0649)" },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
            { "DefaultNumberingSystem", "arab" },
            { "arab.NumberElements",
                new String[] {
                    "\u066b",
                    "\u066c",
                    "\u061b",
                    "\u066a\u061c",
                    "\u0660",
                    "#",
                    "\u061c-",
                    "\u0623\u0633",
                    "\u0609",
                    "\u221e",
                    "\u0644\u064a\u0633\u00a0\u0631\u0642\u0645",
                    "",
                    "",
                }
            },
            { "arab.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "\u200f#,##0.00\u00a0\u00a4",
                    "#,##0%",
                    "",
                }
            },
            { "latn.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "\u200e%\u200e",
                    "0",
                    "#",
                    "\u200e-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u0644\u064a\u0633\u00a0\u0631\u0642\u0645\u064b\u0627",
                    "",
                    "",
                }
            },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "\u200f#,##0.00\u00a0\u00a4;\u200f-#,##0.00\u00a0\u00a4",
                    "#,##0%",
                    "\u061c#,##0.00\u00a4;(\u061c#,##0.00\u00a4)",
                }
            },
            { "short.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{zero:0\u00a0\u0623\u0644\u0641 one:0\u00a0\u0623\u0644\u0641 two:0\u00a0\u0623\u0644\u0641 few:0\u00a0\u0622\u0644\u0627\u0641 many:0\u00a0\u0623\u0644\u0641 other:0\u00a0\u0623\u0644\u0641}",
                    "{zero:00\u00a0\u0623\u0644\u0641 one:00\u00a0\u0623\u0644\u0641 two:00\u00a0\u0623\u0644\u0641 few:00\u00a0\u0623\u0644\u0641 many:00\u00a0\u0623\u0644\u0641 other:00\u00a0\u0623\u0644\u0641}",
                    "{zero:000\u00a0\u0623\u0644\u0641 one:000\u00a0\u0623\u0644\u0641 two:000\u00a0\u0623\u0644\u0641 few:000\u00a0\u0623\u0644\u0641 many:000\u00a0\u0623\u0644\u0641 other:000\u00a0\u0623\u0644\u0641}",
                    "{one:0\u00a0\u0645\u0644\u064a\u0648\u0646 other:0\u00a0\u0645\u0644\u064a\u0648\u0646}",
                    "{one:00\u00a0\u0645\u0644\u064a\u0648\u0646 other:00\u00a0\u0645\u0644\u064a\u0648\u0646}",
                    "{one:000\u00a0\u0645\u0644\u064a\u0648\u0646 other:000\u00a0\u0645\u0644\u064a\u0648\u0646}",
                    "{one:0\u00a0\u0645\u0644\u064a\u0627\u0631 other:0\u00a0\u0645\u0644\u064a\u0627\u0631}",
                    "{one:00\u00a0\u0645\u0644\u064a\u0627\u0631 other:00\u00a0\u0645\u0644\u064a\u0627\u0631}",
                    "{one:000\u00a0\u0645\u0644\u064a\u0627\u0631 other:000\u00a0\u0645\u0644\u064a\u0627\u0631}",
                    "{one:0\u00a0\u062a\u0631\u0644\u064a\u0648\u0646 other:0\u00a0\u062a\u0631\u0644\u064a\u0648\u0646}",
                    "{one:00\u00a0\u062a\u0631\u0644\u064a\u0648\u0646 other:00\u00a0\u062a\u0631\u0644\u064a\u0648\u0646}",
                    "{one:000\u00a0\u062a\u0631\u0644\u064a\u0648\u0646 other:000\u00a0\u062a\u0631\u0644\u064a\u0648\u0646}",
                }
            },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{zero:0' '\u0623\u0644\u0641 one:0' '\u0623\u0644\u0641 two:0' '\u0623\u0644\u0641 few:0' '\u0622\u0644\u0627\u0641 many:0' '\u0623\u0644\u0641 other:0' '\u0623\u0644\u0641}",
                    "{zero:00' '\u0623\u0644\u0641 one:00' '\u0623\u0644\u0641 two:00' '\u0623\u0644\u0641 few:00' '\u0623\u0644\u0641 many:00' '\u0623\u0644\u0641 other:00' '\u0623\u0644\u0641}",
                    "{zero:000' '\u0623\u0644\u0641 one:000' '\u0623\u0644\u0641 two:000' '\u0623\u0644\u0641 few:000' '\u0623\u0644\u0641 many:000' '\u0623\u0644\u0641 other:000' '\u0623\u0644\u0641}",
                    "{zero:0' '\u0645\u0644\u064a\u0648\u0646 one:0' '\u0645\u0644\u064a\u0648\u0646 two:0' '\u0645\u0644\u064a\u0648\u0646 few:0' '\u0645\u0644\u0627\u064a\u064a\u0646 many:0' '\u0645\u0644\u064a\u0648\u0646 other:0' '\u0645\u0644\u064a\u0648\u0646}",
                    "{zero:00' '\u0645\u0644\u064a\u0648\u0646 one:00' '\u0645\u0644\u064a\u0648\u0646 two:00' '\u0645\u0644\u064a\u0648\u0646 few:00' '\u0645\u0644\u0627\u064a\u064a\u0646 many:00' '\u0645\u0644\u064a\u0648\u0646 other:00' '\u0645\u0644\u064a\u0648\u0646}",
                    "{zero:000' '\u0645\u0644\u064a\u0648\u0646 one:000' '\u0645\u0644\u064a\u0648\u0646 two:000' '\u0645\u0644\u064a\u0648\u0646 few:000' '\u0645\u0644\u064a\u0648\u0646 many:000' '\u0645\u0644\u064a\u0648\u0646 other:000' '\u0645\u0644\u064a\u0648\u0646}",
                    "{zero:0' '\u0645\u0644\u064a\u0627\u0631 one:0' '\u0645\u0644\u064a\u0627\u0631 two:0' '\u0645\u0644\u064a\u0627\u0631 few:0' '\u0645\u0644\u064a\u0627\u0631 many:0' '\u0645\u0644\u064a\u0627\u0631 other:0' '\u0645\u0644\u064a\u0627\u0631}",
                    "{zero:00' '\u0645\u0644\u064a\u0627\u0631 one:00' '\u0645\u0644\u064a\u0627\u0631 two:00' '\u0645\u0644\u064a\u0627\u0631 few:00' '\u0645\u0644\u064a\u0627\u0631 many:00' '\u0645\u0644\u064a\u0627\u0631 other:00' '\u0645\u0644\u064a\u0627\u0631}",
                    "{zero:000' '\u0645\u0644\u064a\u0627\u0631 one:000' '\u0645\u0644\u064a\u0627\u0631 two:000' '\u0645\u0644\u064a\u0627\u0631 few:000' '\u0645\u0644\u064a\u0627\u0631 many:000' '\u0645\u0644\u064a\u0627\u0631 other:000' '\u0645\u0644\u064a\u0627\u0631}",
                    "{zero:0' '\u062a\u0631\u0644\u064a\u0648\u0646 one:0' '\u062a\u0631\u0644\u064a\u0648\u0646 two:0' '\u062a\u0631\u0644\u064a\u0648\u0646 few:0' '\u062a\u0631\u0644\u064a\u0648\u0646 many:0' '\u062a\u0631\u0644\u064a\u0648\u0646 other:0' '\u062a\u0631\u0644\u064a\u0648\u0646}",
                    "{zero:00' '\u062a\u0631\u0644\u064a\u0648\u0646 one:00' '\u062a\u0631\u0644\u064a\u0648\u0646 two:00' '\u062a\u0631\u0644\u064a\u0648\u0646 few:00' '\u062a\u0631\u0644\u064a\u0648\u0646 many:00' '\u062a\u0631\u0644\u064a\u0648\u0646 other:00' '\u062a\u0631\u0644\u064a\u0648\u0646}",
                    "{zero:000' '\u062a\u0631\u0644\u064a\u0648\u0646 one:000' '\u062a\u0631\u0644\u064a\u0648\u0646 two:000' '\u062a\u0631\u0644\u064a\u0648\u0646 few:000' '\u062a\u0631\u0644\u064a\u0648\u0646 many:000' '\u062a\u0631\u0644\u064a\u0648\u0646 other:000' '\u062a\u0631\u0644\u064a\u0648\u0646}",
                }
            },
            { "ListPatterns_standard", metaValue_ListPatterns_standard },
            { "ListPatterns_standard-short", metaValue_ListPatterns_standard },
            { "ListPatterns_standard-narrow", metaValue_ListPatterns_standard },
            { "ListPatterns_or", metaValue_ListPatterns_or },
            { "ListPatterns_or-short", metaValue_ListPatterns_or },
            { "ListPatterns_or-narrow", metaValue_ListPatterns_or },
            { "ListPatterns_unit", metaValue_ListPatterns_standard },
            { "ListPatterns_unit-short",
                new String[] {
                    "{0}\u060c \u0648{1}",
                    "{0}\u060c \u0648{1}",
                    "{0}\u060c \u0648{1}",
                    "{0} \u0648{1}",
                    "",
                }
            },
            { "ListPatterns_unit-narrow", metaValue_ListPatterns_standard },
        };
        return data;
    }
}
