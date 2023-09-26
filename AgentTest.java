/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sumana
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AgentTest {

    @Test
    public void testAgentId() {
        AgentSystem agentSystem = new AgentSystem();
        Agent agent = new PingAgent("149", agentSystem);
        assertEquals("149", agent.getAgentId());
    }
}

