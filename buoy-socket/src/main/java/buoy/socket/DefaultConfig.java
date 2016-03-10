package buoy.socket;

public class DefaultConfig implements Config {
    /**
     * Provides the default HTTP connection port
     *
     * @return 80
     */
    @Override
    public int getHttpPort() {
        return 80;
    }

    /**
     * Tells buoy-socket to listen for HTTP connections.
     *
     * @return true
     */
    @Override
    public boolean isHttpEnabled() {
        return true;
    }

    /**
     * Provides the default HTTPS connection port
     *
     * @return 443
     */
    @Override
    public int getHttpsPort() {
        return 443;
    }

    /**
     * Tells buoy-socket to listen for HTTPS connections
     *
     * @return true
     */
    @Override
    public boolean isHttpsEnabled() {
        return true;
    }

    /**
     * Provides the default WebSocket port to listen on
     *
     * @return 80
     */
    @Override
    public int getWebSocketPort() {
        return this.getWebSocketPort();
    }

    /**
     * Tells buoy-socket to listen for WebSocket connections
     *
     * @return true
     */
    @Override
    public boolean isWebSocketEnabled() {
        return this.isHttpEnabled();
    }

    /**
     * Provides the default port for secure WebSocket connections
     *
     * @return proxies to getHttpsPort()
     */
    @Override
    public int getWebSocketSecurePort() {
        return this.getHttpsPort();
    }

    /**
     * Tells buoy-socket to listen for secure WebSocket connections
     *
     * @return proxies to isHttpsEnabled()
     */
    @Override
    public boolean isWebSocketSecureEnabled() {
        return this.isHttpsEnabled();
    }

    /**
     * Provides a default port for listening for incoming Java ObjectInputStream connections
     *
     * @return 8080
     */
    @Override
    public int getObjectStreamPort() {
        return 8080;
    }

    /**
     * Tells buoy-socket to listen for incoming Java ObjectInputStream connections
     *
     * @return true
     */
    @Override
    public boolean isObjectStreamEnabled() {
        return true;
    }
}
