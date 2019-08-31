package be.ida_mediafoundry.jetpack.patchsystemsamples;

import com.adobe.acs.commons.ondeploy.scripts.OnDeployScriptBase;

/**
 * @author michael
 * @since 2019-06-12
 */
public class TestOnDeployScript extends OnDeployScriptBase {

    @Override
    protected void execute() throws Exception {

        logger.info("ddd");

        System.out.println("ddd");
        throw new Exception("THis is the exceptopn");
    }

}
