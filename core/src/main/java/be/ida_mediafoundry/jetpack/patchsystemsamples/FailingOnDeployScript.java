package be.ida_mediafoundry.jetpack.patchsystemsamples;

import com.adobe.acs.commons.ondeploy.scripts.OnDeployScriptBase;

/**
 * @author michael
 * @since 2019-06-12
 */
public class FailingOnDeployScript extends OnDeployScriptBase {

    @Override
    protected void execute() throws Exception {
        throw new Exception("This script is failing!");
    }

}
