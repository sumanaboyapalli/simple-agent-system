# simple-agent-system
The goal is to create a basic system using Java, where different software agents can find and talk to each other if they are on the same local network.
This system serves as a learning tool to help understand how software agents can interact and discover each other.
Implementation Details:
Agent Abstraction:
An abstract class Agent is created as a blueprint for designing specific types of agents. The class holds common attributes like agentId and agentSystem and has an abstract method receive to handle incoming messages.
Specific Agents:
Two concrete agent classes, PingAgent and PongAgent, are derived from the Agent base class, representing specific types of agents. PingAgent sends "ping" messages to PongAgent, which in turn, responds with "pong" messages.
Agent Management:
The AgentSystem class manages the registration, lookup, and messaging between agents. It uses standard Java utility classes for managing agents and employs java.net for network communication.
Discovery Mechanism:
The discoverRemoteAgents method in AgentSystem uses UDP broadcasting for agent discovery within the local network. Agents broadcast a "DISCOVERY_REQUEST" message and respond to incoming discovery requests with a "DISCOVERY_RESPONSE" message.
Networking:
The system utilizes Datagram Sockets for sending and receiving UDP packets, enabling agent discovery through network broadcasting.
AgentTest Class:
AgentTest is a dedicated testing class, designed to verify the correctness of the properties and behaviors of instances of the Agent class. It particularly focuses on ensuring that the AgentId attribute is correctly assigned and retrieved.
pom.xml:
It is used to add dependencies for junit.jupiter.api
Execution:
The code is compiled and executed using standard Java development tools and is designed to run on multiple instances within the same local network.
It uses built-in Java libraries, requiring Junit additional dependencies to run Test packages .
During execution, agents within the local network can discover each other, and specific interactions between PingAgent and PongAgent can be observed through console outputs.
