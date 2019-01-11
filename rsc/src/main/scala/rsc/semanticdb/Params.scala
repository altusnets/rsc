// Copyright (c) 2017-2019 Twitter, Inc.
// Licensed under the Apache License, Version 2.0 (see LICENSE.md).
package rsc.semanticdb

import rsc.syntax._

trait Params {
  self: Converter =>

  protected implicit class ParamOps(parameterized: Parameterized) {
    def desugaredParamss: List[List[Param]] = {
      symtab.desugars.paramss(parameterized)
    }
  }
}
