/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.elasticsearch.castle.nativescript.plugin;

import org.elasticsearch.castle.nativescript.script.CastleScoreScriptFactory;
import org.elasticsearch.plugins.Plugin;
import org.elasticsearch.script.ScriptModule;

/**
 * This class is instantiated when Elasticsearch loads the plugin for the
 * first time.
 */
public class NativeScriptPlugin extends Plugin {

    /**
     * The name of the plugin.
     *
     * This name will be used by elasticsearch in the log file to refer to this plugin.
     *
     * @return plugin name.
     */
    @Override
    public String name() {
        return "native-script-example";
    }

    /**
     * The description of the plugin.
     *
     * @return plugin description
     */
    @Override
    public String description() {
        return "Native script examples";
    }

    public void onModule(ScriptModule module) {
        // Register each script that we defined in this plugin
        module.registerScript("castlepopularity", CastleScoreScriptFactory.class);
    }
}
