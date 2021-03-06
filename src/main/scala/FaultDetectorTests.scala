/*  
*   Copyright © 2018. Thales SA 
*   All rights reserved
*   
*   Redistribution and use in source and binary forms, with or without
*   modification, are permitted provided that the following conditions
*   are met:
*   
*   1. Redistributions of source code must retain the above copyright
*      notice, this list of conditions and the following disclaimer.
*   
*   2. Redistributions in binary form must reproduce the above copyright
*      notice, this list of conditions and the following disclaimer in the
*      documentation and/or other materials provided with the distribution.
*   
*   3. Neither the name of the copyright holders nor the names of its
*      contributors may be used to endorse or promote products derived from
*      this software without specific prior written permission.
*   
*   THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
*   AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
*   IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
*   ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
*   LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
*   CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
*   SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
*   INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
*   CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
*   ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
*   THE POSSIBILITY OF SUCH DAMAGE.
*/

package fault_detector
import chisel3.iotesters.{PeekPokeTester, Driver, ChiselFlatSpec}
import java.nio.file.{Files, Paths}
import java.io.BufferedOutputStream
import java.io.FileOutputStream


class FaultDetectorTests(c: FaultDetector) extends PeekPokeTester(c) {

  def asUnsigned(unsignedLong: Long) =
  ((BigInt(unsignedLong >>> 1) << 1) + (unsignedLong & 1) & 0x00000000ffffffffL)

  val rand = scala.util.Random
}

