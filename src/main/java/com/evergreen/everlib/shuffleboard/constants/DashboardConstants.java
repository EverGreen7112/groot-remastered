package com.evergreen.everlib.shuffleboard.constants;

import java.util.ArrayList;
import java.util.List;

import com.evergreen.everlib.shuffleboard.handlers.Explorer;

/**
 * DashboardConstants
 */
public class DashboardConstants extends Explorer {
    private final List<Constant> m_constants = new ArrayList<>();
    private static final DashboardConstants m_instance = new DashboardConstants();

    private DashboardConstants() {}

    public void resetValues()
    {
        for (Constant constant : m_constants) {
            constant.reset();
        }
    }

    public void resetBoard()
    {
        for (int i = 0; i < m_constants.size(); i++) {
            m_constants.get(i).remove();
            m_constants.remove(i);
        }
    }
    
    public static DashboardConstants getInstance() {
        return m_instance;
    }

    void addConstant(Constant constant) {
        m_constants.add(constant);
    }

    
    
}