package net.rsprot.protocol.internal.game.outgoing.info.npcinfo.extendedinfo

import net.rsprot.protocol.internal.game.outgoing.info.TransientExtendedInfo
import net.rsprot.protocol.internal.game.outgoing.info.encoder.PrecomputedExtendedInfoEncoder
import net.rsprot.protocol.internal.platform.PlatformMap

public class Transformation(
    override val encoders: PlatformMap<PrecomputedExtendedInfoEncoder<Transformation>>,
) : TransientExtendedInfo<Transformation, PrecomputedExtendedInfoEncoder<Transformation>>() {
    public var id: UShort = 0xFFFFu

    override fun clear() {
        releaseBuffers()
        this.id = 0xFFFFu
    }
}
