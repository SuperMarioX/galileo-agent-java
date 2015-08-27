/*
The MIT License
Copyright (c) 2013 Mashape (http://mashape.com)

Permission is hereby granted, free of charge, to any person obtaining
a copy of this software and associated documentation files (the
"Software"), to deal in the Software without restriction, including
without limitation the rights to use, copy, modify, merge, publish,
distribute, sublicense, and/or sell copies of the Software, and to
permit persons to whom the Software is furnished to do so, subject to
the following conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.mashape.analytics.agent.common;

public class AnalyticsConstants {
	public static final String ANALYTICS_SERVER_URL = "analytics.server.url";
	public static final String ANALYTICS_SERVER_PORT = "analytics.server.port";
	public static final String WORKER_QUEUE_COUNT = "analytics.queue.size";
	public static final String ANALYTICS_DATA = "data";
	public static final String SOCKET_POOL_SIZE_MIN = "analytics.socket.min";
	public static final String SOCKET_POOL_SIZE_MAX = "analytics.socket.max";
	public static final String SOCKET_POOL_UPDATE_INTERVAL = "analytics.socket.keepalivetime";
	public static final String ANALYTICS_TOKEN = "analytics.token";
	public static final String HAR_VERSION = "1.2";
	public static final String AGENT_NAME = "Analytics Java Agent";
	public static final String AGENT_VERSION = "1.0";
	public static final String ANALYTICS_ENABLED = "analytics.enabled.flag";
	public static final String CLIENT_IP_ADDRESS = "clientIpAddress";
	public static final String ENVIRONMENT = "analytics.environment";
	public static final String ALF_VERSION = "1.0.0";
	public static final String ALF_VERSION_PREFIX = "alf_1.0.0 ";
	public static final String SHOW_POOL_STATUS_TICKER = "analytics.status.ticker";
	public static final String STATUS_TICKER_INTERVAL = "analytics.ticker.interval";
}
