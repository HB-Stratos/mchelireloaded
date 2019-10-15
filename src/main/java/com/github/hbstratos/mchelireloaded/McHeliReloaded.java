package com.github.hbstratos.mchelireloaded;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author HB Stratos
 */
@Mod(McHeliReloaded.MODID)
public class McHeliReloaded {

    public static final String MODID = "mchelireloaded";

    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public McHeliReloaded(){
        LOGGER.debug("McHeliReloaded loading...");
    }

}
