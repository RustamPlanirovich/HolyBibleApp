package com.nauk0a.holybibleapp.data

import com.nauk0a.holybibleapp.core.Abstract
import com.nauk0a.holybibleapp.domain.BookDomain

sealed class BookData : Abstract.Object<BookDomain, Abstract.Mapper.Empty>() {
}