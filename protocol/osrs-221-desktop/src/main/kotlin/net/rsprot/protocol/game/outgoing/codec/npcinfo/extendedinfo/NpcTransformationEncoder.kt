package net.rsprot.protocol.game.outgoing.codec.npcinfo.extendedinfo

import io.netty.buffer.ByteBufAllocator
import net.rsprot.buffer.JagByteBuf
import net.rsprot.buffer.extensions.toJagByteBuf
import net.rsprot.compression.HuffmanCodec
import net.rsprot.protocol.internal.game.outgoing.info.encoder.PrecomputedExtendedInfoEncoder
import net.rsprot.protocol.internal.game.outgoing.info.npcinfo.extendedinfo.Transformation

public class NpcTransformationEncoder : PrecomputedExtendedInfoEncoder<Transformation> {
    override fun precompute(
        alloc: ByteBufAllocator,
        huffmanCodec: HuffmanCodec,
        extendedInfo: Transformation,
    ): JagByteBuf {
        val buffer =
            alloc
                .buffer(2, 2)
                .toJagByteBuf()
        buffer.p2Alt1(extendedInfo.id.toInt())
        return buffer
    }
}
