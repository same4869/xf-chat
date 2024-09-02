/*
 * Copyright 2021 WangYiqian
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 *
 */

package com.github.wangyiqian.stockchart.childchart.base

import com.github.wangyiqian.stockchart.listener.OnHighlightListener

/**
 * @author wangyiqian E-mail: wangyiqian9891@gmail.com
 * @version 创建时间: 2021/2/7
 */
abstract class BaseChildChartConfig(
    height: Int,
    marginTop: Int,
    marginBottom: Int,
    var onHighlightListener: OnHighlightListener?,
    /**
     * 主数据显示区域的顶部内间距
     */
    var chartMainDisplayAreaPaddingTop: Float,
    /**
     * 主数据显示区域的底部内间距
     */
    var chartMainDisplayAreaPaddingBottom: Float
) {
    var height: Int = 0
        set(value) {
            setSizeFlag = true
            field = value
        }

    var marginTop: Int = 0
        set(value) {
            setMarginFlag = true
            field = value
        }

    var marginBottom: Int = 0
        set(value) {
            setMarginFlag = true
            field = value
        }

    var setSizeFlag = false

    var setMarginFlag = false

    init {
        this.height = height
        this.marginTop = marginTop
        this.marginBottom = marginBottom
    }

}