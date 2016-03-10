package buoy.socket;

public interface Config {
    /**
     * @return The port to listen on for HTTP connections (typically 80)
     */
    public int getHttpPort();

    /**
     * @return Whether or not to listen for HTTP connections
     */
    public boolean isHttpEnabled();

    /**
     * @return The port to listen on for HTTPS connections (typically 443)
     */
    public int getHttpsPort();

    /**
     * @return Whether or not to listen for HTTPS connections
     */
    public boolean isHttpsEnabled();

    /**
     * @return The port to listen on for WebSocket connections. Typically the same as the HTTP port
     */
    public int getWebSocketPort();

    /**
     * @return Whether or not to listen for WebSocket connections
     */
    public boolean isWebSocketEnabled();

    /**
     * @return The port to listen on for secure WebSocket connections (typically 443)
     */
    public int getWebSocketSecurePort();

    /**
     * @return Whether or not to listen for secure WebSocket connections
     */
    public boolean isWebSocketSecureEnabled();

    /**
     * @return The port to listen on for Java's ObjectInputStream connections on
     */
    public int getObjectStreamPort();

    /**
     * @return Whether or not to listen for Java's ObjectInputStream connections
     */
    public boolean isObjectStreamEnabled();
}
