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

public class FormatData_csw extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_DayNames = new String[] {
            "\u140a\u152d\u14a5\u1426\u1401\u1403 \u146d\u14ef\u1472\u1424",
            "\u142f\u152d\u1420\u146d\u14ef\u1472\u1424",
            "\u14c2\u14f1\u146d\u14ef\u1472\u1424",
            "\u140a\u1431\u1426\u1455\u1418\u1423",
            "\u14c0\u1413\u146d\u14ef\u1472\u1424",
            "\u14c2\u152d\u14c7\u14c4\u146d\u14ef\u1472\u1424",
            "\u14aa\u144e\u14c4\u140f\u146d\u14ef\u1472\u1424",
        };
        final String[] metaValue_MonthNames = new String[] {
            "\u146d\u14f4\u1431\u14ef\u14bc",
            "\u14a5\u146d\u14ef\u140f\u1431\u14ef\u14bc",
            "\u14c2\u1422\u146d\u1431\u14ef\u14bc",
            "\u140a\u14c2\u146d\u1431\u14ef\u14bc",
            "\u14f4\u146d\u1438\u1472\u140f\u1431\u14ef\u14bc",
            "\u1438\u1422\u1472\u140d\u1426\u1405\u1431\u14ef\u14bc",
            "\u1438\u1422\u146f\u140f\u1431\u14ef\u14bc",
            "\u1405\u1438\u1426\u1405\u140f\u1431\u14ef\u14bc",
            "\u1455\u1426\u147f\u146d\u1431\u14ef\u14bc",
            "\u1431\u14aa\u1426\u140a\u14a7\u140f\u1431\u14ef\u14bc",
            "\u140a\u147f\u144e\u14c4\u140f\u1431\u14ef\u14bc",
            "\u1438\u1418\u1422\u1490\u1472\u14c2\u14f9\u1431\u14ef\u14bc",
            "",
        };
        final Object[][] data = new Object[][] {
            { "generic.DayNames", metaValue_generic_DayNames },
            { "generic.DayAbbreviations", metaValue_generic_DayNames },
            { "MonthNames", metaValue_MonthNames },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "MonthAbbreviations", metaValue_MonthNames },
            { "standalone.MonthAbbreviations", metaValue_MonthNames },
            { "DayNames", metaValue_generic_DayNames },
            { "standalone.DayNames", metaValue_generic_DayNames },
            { "DayAbbreviations", metaValue_generic_DayNames },
            { "standalone.DayAbbreviations", metaValue_generic_DayNames },
            { "field.year", "\u140a\u1422\u146d" },
            { "field.month", "\u1431\u14ef\u14a7\u1418\u1420" },
            { "field.week", "\u146d\u14ef\u1472\u1418" },
            { "timezone.regionFormat", "{0} \u1401\u1403\u1422\u1438\u14c2\u141f" },
            { "timezone.regionFormat.daylight", "{0} \u146e\u14ef\u1473\u1424 \u1401\u1403\u1422\u1438\u14c2\u141f" },
            { "timezone.regionFormat.standard", "{0} \u142f\u152d\u146f\u1426\u1455\u1403\u1427\u1423 \u1401\u1403\u1422\u1438\u14c2\u141f" },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "buddhist.DayNames", metaValue_generic_DayNames },
            { "buddhist.DayAbbreviations", metaValue_generic_DayNames },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "japanese.MonthAbbreviations", metaValue_MonthNames },
            { "japanese.DayNames", metaValue_generic_DayNames },
            { "japanese.DayAbbreviations", metaValue_generic_DayNames },
            { "roc.MonthNames", metaValue_MonthNames },
            { "roc.MonthAbbreviations", metaValue_MonthNames },
            { "roc.DayNames", metaValue_generic_DayNames },
            { "islamic.DayNames", metaValue_generic_DayNames },
            { "islamic.DayAbbreviations", metaValue_generic_DayNames },
        };
        return data;
    }
}
