package com.adarsh.logback.api;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.filter.LevelFilter;

/**
 * @author Adarsh
 * @author $LastChangedBy: adarsh $
 * @version $Revision: 1595 $, $Date:: 5/4/12 6:12 PM#$
 */
public class LevelFilterImpl extends LevelFilter {

    @Override
    public void setLevel(Level level) {
      super.setLevel(level);
    }

}
