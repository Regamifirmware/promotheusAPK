package com.serenegiant.mediaeffect;
/*
 * libcommon
 * utility/helper classes for myself
 *
 * Copyright (c) 2014-2022 saki t_saki@serenegiant.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
*/

import android.media.effect.EffectContext;
import android.media.effect.EffectFactory;

public class MediaEffectFishEye extends MediaEffect {
	/**
	 * コンストラクタ
	 * GLコンテキスト内で生成すること
	 *
	 * @param effect_context
	 * @param scale The scale of the distortion. between 0 and 1. Zero means no distortion.
	 */
	public MediaEffectFishEye(final EffectContext effect_context, final float scale) {
		super(effect_context, EffectFactory.EFFECT_FISHEYE);
		setParameter(scale);
	}

	/**
	 * @param scale The scale of the distortion. between 0 and 1. Zero means no distortion.
	 * @return
	 */
	public MediaEffectFishEye setParameter(final float scale) {
		setParameter("scale", scale);
		return this;
	}
}
