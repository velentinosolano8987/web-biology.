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

public class FormatData_tr extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String metaValue_generic_DateFormatItem_yyyyMMM = "G MMM y";
        final String metaValue_generic_DateFormatItem_yyyyMMMEd = "G d MMM y E";
        final String[] metaValue_MonthNames = new String[] {
            "Ocak",
            "\u015eubat",
            "Mart",
            "Nisan",
            "May\u0131s",
            "Haziran",
            "Temmuz",
            "A\u011fustos",
            "Eyl\u00fcl",
            "Ekim",
            "Kas\u0131m",
            "Aral\u0131k",
            "",
        };
        final String[] metaValue_MonthAbbreviations = new String[] {
            "Oca",
            "\u015eub",
            "Mar",
            "Nis",
            "May",
            "Haz",
            "Tem",
            "A\u011fu",
            "Eyl",
            "Eki",
            "Kas",
            "Ara",
            "",
        };
        final String[] metaValue_MonthNarrows = new String[] {
            "O",
            "\u015e",
            "M",
            "N",
            "M",
            "H",
            "T",
            "A",
            "E",
            "E",
            "K",
            "A",
            "",
        };
        final String[] metaValue_generic_DayNames = new String[] {
            "Pazar",
            "Pazartesi",
            "Sal\u0131",
            "\u00c7ar\u015famba",
            "Per\u015fembe",
            "Cuma",
            "Cumartesi",
        };
        final String[] metaValue_generic_DayAbbreviations = new String[] {
            "Paz",
            "Pzt",
            "Sal",
            "\u00c7ar",
            "Per",
            "Cum",
            "Cmt",
        };
        final String[] metaValue_generic_DayNarrows = new String[] {
            "P",
            "P",
            "S",
            "\u00c7",
            "P",
            "C",
            "C",
        };
        final String[] metaValue_generic_QuarterNames = new String[] {
            "1. \u00e7eyrek",
            "2. \u00e7eyrek",
            "3. \u00e7eyrek",
            "4. \u00e7eyrek",
        };
        final String[] metaValue_generic_QuarterAbbreviations = new String[] {
            "\u00c71",
            "\u00c72",
            "\u00c73",
            "\u00c74",
        };
        final String[] metaValue_QuarterNarrows = new String[] {
            "1.",
            "2.",
            "3.",
            "4.",
        };
        final String[] metaValue_generic_abbreviated_AmPmMarkers = new String[] {
            "\u00d6\u00d6",
            "\u00d6S",
            "gece yar\u0131s\u0131",
            "\u00f6\u011fle",
            "sabah",
            "\u00f6\u011fleden \u00f6nce",
            "\u00f6\u011fleden sonra",
            "ak\u015fam\u00fcst\u00fc",
            "ak\u015fam",
            "",
            "gece",
            "",
        };
        final String[] metaValue_generic_narrow_AmPmMarkers = new String[] {
            "\u00f6\u00f6",
            "\u00f6s",
            "gece",
            "\u00f6",
            "sabah",
            "\u00f6\u011fleden \u00f6nce",
            "\u00f6\u011fleden sonra",
            "ak\u015fam\u00fcst\u00fc",
            "ak\u015fam",
            "",
            "gece",
            "",
        };
        final String[] metaValue_java_time_long_Eras = new String[] {
            "Milattan \u00d6nce",
            "Milattan Sonra",
        };
        final String[] metaValue_java_time_Eras = new String[] {
            "M\u00d6",
            "MS",
        };
        final String[] metaValue_generic_TimePatterns = new String[] {
            "HH:mm:ss zzzz",
            "HH:mm:ss z",
            "HH:mm:ss",
            "HH:mm",
        };
        final String[] metaValue_generic_DateTimePatterns = new String[] {
            "{1} {0}",
            "{1} {0}",
            "{1} {0}",
            "{1} {0}",
        };
        final String metaValue_generic_DateFormatItem_hm = "a\u202fh:mm";
        final String metaValue_generic_DateFormatItem_Ehm = "E a\u202fh:mm";
        final String metaValue_generic_DateFormatItem_hms = "a\u202fh:mm:ss";
        final String metaValue_generic_DateFormatItem_hmv = "a\u202fh:mm v";
        final String metaValue_generic_DateFormatItem_hmsv = "a\u202fh:mm:ss v";
        final String metaValue_generic_DateFormatItem_yw = "Y 'y\u0131l\u0131n\u0131n' w. 'haftas\u0131'";
        final String metaValue_generic_DateFormatItem_mmss = "mm:ss";
        final String metaValue_generic_DateFormatItem_MMMMEd = "d MMMM E";
        final String metaValue_generic_DateFormatItem_EBhm = "E B h:mm";
        final String metaValue_generic_DateFormatItem_MMMMd = "d MMMM";
        final String metaValue_generic_DateFormatItem_MMMEd = "d MMM E";
        final String metaValue_generic_DateFormatItem_Bh = "B h";
        final String metaValue_generic_DateFormatItem_h = "a\u202fh";
        final String metaValue_generic_DateFormatItem_GyMd = "d/M/y GGGGG";
        final String metaValue_generic_DateFormatItem_MMMd = "d MMM";
        final String metaValue_generic_DateFormatItem_MMMMW = "MMMM 'ay\u0131n\u0131n' W. 'haftas\u0131'";
        final String metaValue_generic_DateFormatItem_yMMMEd = "d MMM y E";
        final String metaValue_generic_DateFormatItem_Ehms = "E a\u202fh:mm:ss";
        final String metaValue_generic_DateFormatItem_yMEd = "d.M.y E";
        final String metaValue_generic_DateFormatItem_Bhms = "B h:mm:ss";
        final String metaValue_generic_DateFormatItem_GyMMMd = "G d MMM y";
        final String metaValue_generic_DateFormatItem_yMMMd = "d MMM y";
        final String metaValue_generic_DateFormatItem_yMMM = "MMM y";
        final String metaValue_generic_DateFormatItem_Md = "d/M";
        final String metaValue_generic_DateFormatItem_EBhms = "E B h:mm:ss";
        final String metaValue_generic_DateFormatItem_Ed = "d E";
        final String metaValue_generic_DateFormatItem_Bhm = "B h:mm";
        final String metaValue_generic_DateFormatItem_MEd = "d/MM E";
        final String metaValue_generic_DateFormatItem_yMM = "MM.y";
        final String metaValue_generic_DateFormatItem_yMd = "dd.MM.y";
        final String metaValue_generic_DateFormatItem_yM = "MM/y";
        final String metaValue_generic_DateFormatItem_yMMMM = "MMMM y";
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "G d MMMM y EEEE",
            "G d MMMM y",
            "G d MMM y",
            "GGGGG d.MM.y",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "GGGG d MMMM y EEEE",
            "GGGG d MMMM y",
            "GGGG d MMM y",
            "G d.MM.y",
        };
        final String[] metaValue_java_time_roc_long_Eras = new String[] {
            "R.O.C. \u00d6ncesi",
            "Minguo",
        };
        final String[] metaValue_java_time_roc_Eras = new String[] {
            "Before R.O.C.",
            "Minguo",
        };
        final String[] metaValue_java_time_islamic_long_Eras = new String[] {
            "",
            "Hicri",
        };
        final String metaValue_calendarname_gregorian = "Miladi Takvim";
        final String[] metaValue_ListPatterns_standard = new String[] {
            "",
            "",
            "{0} ve {1}",
            "{0} ve {1}",
            "",
        };
        final String[] metaValue_ListPatterns_or = new String[] {
            "",
            "",
            "{0} veya {1}",
            "{0} veya {1}",
            "",
        };
        final Object[][] data = new Object[][] {
            { "generic.DayNames", metaValue_generic_DayNames },
            { "generic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "generic.DayNarrows", metaValue_generic_DayNarrows },
            { "generic.QuarterNames", metaValue_generic_QuarterNames },
            { "generic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "generic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "generic.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "generic.DateTimePatterns", metaValue_generic_DateTimePatterns },
            { "generic.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "generic.DateFormatItem.yyyyMMMM", "G MMMM y" },
            { "generic.DateFormatItem.yyyyQQQQ", "G y/QQQQ" },
            { "generic.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "generic.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "generic.DateFormatItem.yyyyMMMd", "G dd MMM y" },
            { "generic.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "generic.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "generic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "generic.DateFormatItem.mmss", metaValue_generic_DateFormatItem_mmss },
            { "generic.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "generic.DateFormatItem.yyyyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "generic.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "generic.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "generic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "generic.DateFormatItem.Bh", metaValue_generic_DateFormatItem_Bh },
            { "generic.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "generic.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "generic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "generic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "generic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "generic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "generic.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "generic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "generic.DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "generic.DateFormatItem.yyyyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "generic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "generic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "generic.DateFormatItem.yyyyMEd", "GGGGG dd.MM.y E" },
            { "generic.DateFormatItem.yyyyMd", "GGGGG dd.MM.y" },
            { "generic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "generic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "generic.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "generic.DateFormatItem.yyyyMM", "MM.y G" },
            { "generic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "generic.DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "generic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "generic.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "generic.DateFormatItem.yyyyQQQ", "G y/QQQ" },
            { "generic.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "generic.DateFormatItem.yyyyM", "GGGGG M/y" },
            { "generic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "generic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "generic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "MonthNames", metaValue_MonthNames },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "standalone.MonthAbbreviations", metaValue_MonthAbbreviations },
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
            { "QuarterNarrows", metaValue_QuarterNarrows },
            { "standalone.QuarterNarrows", metaValue_QuarterNarrows },
            { "AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "java.time.long.Eras", metaValue_java_time_long_Eras },
            { "long.Eras", metaValue_java_time_long_Eras },
            { "java.time.Eras", metaValue_java_time_Eras },
            { "Eras", metaValue_java_time_Eras },
            { "java.time.narrow.Eras", metaValue_java_time_Eras },
            { "narrow.Eras", metaValue_java_time_Eras },
            { "field.era", "\u00e7a\u011f" },
            { "field.year", "y\u0131l" },
            { "field.month", "ay" },
            { "field.week", "hafta" },
            { "field.weekday", "haftan\u0131n g\u00fcn\u00fc" },
            { "field.dayperiod", "\u00d6\u00d6/\u00d6S" },
            { "field.hour", "saat" },
            { "timezone.regionFormat", "{0} Saati" },
            { "timezone.regionFormat.daylight", "{0} Yaz Saati" },
            { "timezone.regionFormat.standard", "{0} Standart Saati" },
            { "field.minute", "dakika" },
            { "field.second", "saniye" },
            { "field.zone", "saat dilimi" },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "DatePatterns",
                new String[] {
                    "d MMMM y EEEE",
                    "d MMMM y",
                    "d MMM y",
                    "d.MM.y",
                }
            },
            { "DateTimePatterns", metaValue_generic_DateTimePatterns },
            { "PluralRules", "one:n = 1" },
            { "DayPeriodRules", "midnight:00:00;noon:12:00;night1:21:00-06:00;morning2:11:00-12:00;afternoon1:12:00-18:00;morning1:06:00-11:00;afternoon2:18:00-19:00;evening1:19:00-21:00" },
            { "DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "DateFormatItem.mmss", metaValue_generic_DateFormatItem_mmss },
            { "DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "DateFormatItem.Bh", metaValue_generic_DateFormatItem_Bh },
            { "DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "buddhist.DayNames", metaValue_generic_DayNames },
            { "buddhist.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "buddhist.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "buddhist.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "buddhist.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "buddhist.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "buddhist.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "buddhist.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "buddhist.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "buddhist.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "buddhist.DateFormatItem.mmss", metaValue_generic_DateFormatItem_mmss },
            { "buddhist.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "buddhist.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "buddhist.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "buddhist.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.DateFormatItem.Bh", metaValue_generic_DateFormatItem_Bh },
            { "buddhist.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "buddhist.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "buddhist.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "buddhist.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "buddhist.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "buddhist.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "buddhist.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "buddhist.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "buddhist.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "buddhist.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "buddhist.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "buddhist.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "buddhist.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "buddhist.DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "buddhist.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "buddhist.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "buddhist.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "buddhist.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "buddhist.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "japanese.DayNames", metaValue_generic_DayNames },
            { "japanese.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "japanese.QuarterNames", metaValue_generic_QuarterNames },
            { "japanese.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "japanese.QuarterNarrows", metaValue_QuarterNarrows },
            { "japanese.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "japanese.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "japanese.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.japanese.DatePatterns",
                new String[] {
                    "d MMMM y G EEEE",
                    "d MMMM y G",
                    "d MMM y G",
                    "d.MM.y G",
                }
            },
            { "japanese.DatePatterns",
                new String[] {
                    "d MMMM y GGGG EEEE",
                    "d MMMM y GGGG",
                    "d MMM y GGGG",
                    "d.MM.y GGGG",
                }
            },
            { "japanese.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "japanese.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "japanese.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "japanese.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "japanese.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "japanese.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "japanese.DateFormatItem.mmss", metaValue_generic_DateFormatItem_mmss },
            { "japanese.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "japanese.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "japanese.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "japanese.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "japanese.DateFormatItem.Bh", metaValue_generic_DateFormatItem_Bh },
            { "japanese.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "japanese.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "japanese.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "japanese.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "japanese.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "japanese.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "japanese.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "japanese.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "japanese.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "japanese.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "japanese.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "japanese.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "japanese.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "japanese.DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "japanese.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "japanese.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "japanese.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "japanese.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "japanese.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "roc.MonthNames", metaValue_MonthNames },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "roc.DayNames", metaValue_generic_DayNames },
            { "roc.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "roc.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.QuarterNames", metaValue_generic_QuarterNames },
            { "roc.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "roc.QuarterNarrows", metaValue_QuarterNarrows },
            { "roc.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "roc.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "java.time.roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "java.time.roc.Eras", metaValue_java_time_roc_Eras },
            { "roc.Eras", metaValue_java_time_roc_Eras },
            { "java.time.roc.narrow.Eras", metaValue_java_time_roc_Eras },
            { "roc.narrow.Eras", metaValue_java_time_roc_Eras },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.roc.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "roc.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "roc.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "roc.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "roc.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "roc.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "roc.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "roc.DateFormatItem.mmss", metaValue_generic_DateFormatItem_mmss },
            { "roc.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "roc.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "roc.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "roc.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "roc.DateFormatItem.Bh", metaValue_generic_DateFormatItem_Bh },
            { "roc.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "roc.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "roc.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "roc.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "roc.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "roc.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "roc.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "roc.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "roc.DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "roc.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "roc.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "roc.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "roc.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "roc.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "roc.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "roc.DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "roc.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "roc.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "roc.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "roc.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "roc.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "roc.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic.MonthNames",
                new String[] {
                    "Muharrem",
                    "Safer",
                    "Rebi\u00fclevvel",
                    "Rebi\u00fclahir",
                    "Cemaziyelevvel",
                    "Cemaziyelahir",
                    "Recep",
                    "\u015eaban",
                    "Ramazan",
                    "\u015eevval",
                    "Zilkade",
                    "Zilhicce",
                    "",
                }
            },
            { "islamic.MonthAbbreviations",
                new String[] {
                    "Muhar.",
                    "Safer",
                    "R.evvel",
                    "R.ahir",
                    "C.evvel",
                    "C.ahir",
                    "Recep",
                    "\u015eaban",
                    "Ram.",
                    "\u015eevval",
                    "Zilkade",
                    "Zilhicce",
                    "",
                }
            },
            { "islamic.DayNames", metaValue_generic_DayNames },
            { "islamic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "java.time.islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "java.time.islamic.Eras", metaValue_java_time_islamic_long_Eras },
            { "islamic.Eras", metaValue_java_time_islamic_long_Eras },
            { "java.time.islamic.narrow.Eras", metaValue_java_time_islamic_long_Eras },
            { "islamic.narrow.Eras", metaValue_java_time_islamic_long_Eras },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.islamic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "islamic.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "islamic.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "islamic.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "islamic.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "islamic.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "islamic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic.DateFormatItem.mmss", metaValue_generic_DateFormatItem_mmss },
            { "islamic.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "islamic.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "islamic.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic.DateFormatItem.Bh", metaValue_generic_DateFormatItem_Bh },
            { "islamic.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "islamic.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic.DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "islamic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "islamic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "islamic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic.DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "islamic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "islamic.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic-civil.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "islamic-civil.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "islamic-civil.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "islamic-civil.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "islamic-civil.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "islamic-civil.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-civil.DateFormatItem.mmss", metaValue_generic_DateFormatItem_mmss },
            { "islamic-civil.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "islamic-civil.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "islamic-civil.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic-civil.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-civil.DateFormatItem.Bh", metaValue_generic_DateFormatItem_Bh },
            { "islamic-civil.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "islamic-civil.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic-civil.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic-civil.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic-civil.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-civil.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "islamic-civil.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-civil.DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "islamic-civil.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "islamic-civil.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-civil.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-civil.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-civil.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "islamic-civil.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic-civil.DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "islamic-civil.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-civil.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "islamic-civil.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic-civil.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-civil.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic-civil.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic-umalqura.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "islamic-umalqura.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "islamic-umalqura.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "islamic-umalqura.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "islamic-umalqura.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "islamic-umalqura.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-umalqura.DateFormatItem.mmss", metaValue_generic_DateFormatItem_mmss },
            { "islamic-umalqura.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "islamic-umalqura.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "islamic-umalqura.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic-umalqura.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-umalqura.DateFormatItem.Bh", metaValue_generic_DateFormatItem_Bh },
            { "islamic-umalqura.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "islamic-umalqura.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic-umalqura.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-umalqura.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic-umalqura.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic-umalqura.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-umalqura.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "islamic-umalqura.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-umalqura.DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "islamic-umalqura.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_GyMMMd },
            { "islamic-umalqura.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-umalqura.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-umalqura.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "islamic-umalqura.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic-umalqura.DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "islamic-umalqura.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-umalqura.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "islamic-umalqura.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic-umalqura.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-umalqura.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic-umalqura.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "calendarname.islamic-civil", "Hicri Takvim (16 Temmuz 622)" },
            { "calendarname.islamic", "Hicri Takvim" },
            { "calendarname.buddhist", "Budist Takvimi" },
            { "calendarname.japanese", "Japon Takvimi" },
            { "calendarname.roc", "\u00c7in Cumhuriyeti Takvimi" },
            { "calendarname.islamic-umalqura", "Hicri Takvim (\u00dcmm\u00fc-l Kurra Takvimi)" },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
            { "latn.NumberElements",
                new String[] {
                    ",",
                    ".",
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
                    "%#,##0",
                    "\u00a4#,##0.00;(\u00a4#,##0.00)",
                }
            },
            { "short.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0\u00a0B other:0\u00a0B}",
                    "{one:00\u00a0B other:00\u00a0B}",
                    "{one:000\u00a0B other:000\u00a0B}",
                    "{one:0\u00a0Mn other:0\u00a0Mn}",
                    "{one:00\u00a0Mn other:00\u00a0Mn}",
                    "{one:000\u00a0Mn other:000\u00a0Mn}",
                    "{one:0\u00a0Mr other:0\u00a0Mr}",
                    "{one:00\u00a0Mr other:00\u00a0Mr}",
                    "{one:000\u00a0Mr other:000\u00a0Mr}",
                    "{one:0\u00a0Tn other:0\u00a0Tn}",
                    "{one:00\u00a0Tn other:00\u00a0Tn}",
                    "{one:000\u00a0Tn other:000\u00a0Tn}",
                }
            },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0' 'bin other:0' 'bin}",
                    "{one:00' 'bin other:00' 'bin}",
                    "{one:000' 'bin other:000' 'bin}",
                    "{one:0' 'milyon other:0' 'milyon}",
                    "{one:00' 'milyon other:00' 'milyon}",
                    "{one:000' 'milyon other:000' 'milyon}",
                    "{one:0' 'milyar other:0' 'milyar}",
                    "{one:00' 'milyar other:00' 'milyar}",
                    "{one:000' 'milyar other:000' 'milyar}",
                    "{one:0' 'trilyon other:0' 'trilyon}",
                    "{one:00' 'trilyon other:00' 'trilyon}",
                    "{one:000' 'trilyon other:000' 'trilyon}",
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
