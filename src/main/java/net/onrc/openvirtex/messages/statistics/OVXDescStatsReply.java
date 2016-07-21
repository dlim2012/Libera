/*******************************************************************************
 * Copyright 2014 Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ****************************************************************************
 * Libera HyperVisor development based OpenVirteX for SDN 2.0
 *
 *   OpenFlow Version Up with OpenFlowj
 *
 * This is updated by Libera Project team in Korea University
 *
 * Author: Seong-Mun Kim (bebecry@gmail.com)
 ******************************************************************************/
package net.onrc.openvirtex.messages.statistics;

import net.onrc.openvirtex.elements.datapath.PhysicalSwitch;
import net.onrc.openvirtex.messages.OVXStatisticsReply;
import org.projectfloodlight.openflow.protocol.OFDescStatsReply;
import org.projectfloodlight.openflow.protocol.OFMessage;
import org.projectfloodlight.openflow.protocol.OFStatsType;

public class OVXDescStatsReply extends OVXStatistics implements VirtualizableStatistic {
    protected OFDescStatsReply ofDescStatsReply;
    public OVXDescStatsReply(OFMessage ofMessage) {
        super(OFStatsType.DESC);

        this.ofDescStatsReply = (OFDescStatsReply)ofMessage;
    }

    public OFDescStatsReply getOFMessage() {
        return this.ofDescStatsReply;
    }

    @Override
    public void virtualizeStatistic(PhysicalSwitch sw, OVXStatisticsReply msg) {

    }
}