/*
 * Copyright 2014-2016 michael-simons.eu.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ac.simons.biking2.bikes.highcharts;

import ac.simons.biking2.bikes.highcharts.SeriesOptions;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

/**
 * @author Michael J. Simons, 2014-02-11
 */
public class SeriesOptionsTest {

    @Test
    public void testBuilder() {
        SeriesOptions seriesOptions = new SeriesOptions.Builder<>(object -> object).build();
        assertThat(seriesOptions.isAnimation(), is(nullValue()));

        seriesOptions = new SeriesOptions.Builder<>(object -> object)
                .enableAnimation()
                .build();
        assertThat(seriesOptions.isAnimation(), is(true));

        seriesOptions = new SeriesOptions.Builder<>(object -> object)
                .disableAnimation()
                .build();
        assertThat(seriesOptions.isAnimation(), is(false));
    }
}
